public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> input = new ArrayList();
        List<Integer> visited = new ArrayList();
        
        if(nums == null || nums.length == 0){
            return res;
        }
        
        Arrays.sort(nums);
        dfs(nums,visited,input,res);
        return res;
    }
    
    private void dfs(int[] nums,List<Integer> visited,List<Integer> input,List<List<Integer>> res){
        if(input.size() == nums.length){
            List<Integer> in= new ArrayList(input);
            res.add(in);
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!visited.contains(i)){
                input.add(nums[i]);
                visited.add(i);
                dfs(nums,visited,input,res);
                input.remove(input.size()-1);
                visited.remove(visited.size()-1);
            }else{
                continue;
            }
            
            while(i<nums.length-1 && nums[i] == nums[i+1]){
                i++;
            }
            
           
        }
    }
}