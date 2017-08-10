public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        List<Integer> temp =new ArrayList<>();
        res.add(temp);
        if(nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        boolean[] flag = new boolean[nums.length];
        dfs(nums,flag,res,input,0);
        return res;
    }
    
    private void dfs(int[] nums,boolean[] flag,List<List<Integer>> res,List<Integer> input,int index){
        if(input.size() == nums.length) return;
        
        int temp = Integer.MAX_VALUE;
        for(int i=index;i<nums.length;i++){
            if(temp != nums[i] && flag[i] == false){
                    temp = nums[i];
                    input.add(nums[i]);
                    flag[i] = true;
                    List<Integer> n = new ArrayList<>(input);
                    res.add(n);
                    dfs(nums,flag,res,input,i+1);
                    input.remove(input.size()-1);
                    flag[i] = false;
            }
        }
    }
}