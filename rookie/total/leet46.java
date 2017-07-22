public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> input = new ArrayList();
        
        if(nums == null || nums.length==0){
            return res;
        }
        
        dfs(nums,input,res);
        return res;
    }
    
    private void dfs(int[] nums,List<Integer> input,List<List<Integer>> res){
        if(input.size() == nums.length){
            res.add(new ArrayList(input));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!input.contains(nums[i])){
            input.add(nums[i]);
            dfs(nums,input,res);
            input.remove(input.size()-1);}
        }
    }
}