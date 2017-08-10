public class Solution {
    public boolean makesquare(int[] nums) {
        if(nums == null || nums.length < 4) return false;
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total += nums[i];
        }

        if(total % 4 != 0)return false;
        int target = total/4;
        return dfs(nums,new int[4],0,target);
    }

    private boolean dfs(int[] nums,int[] sum,int index, int target){
        if(index == nums.length){
            if(sum[0] == target && sum[1] == target && sum[2] == target) return true;
            return false;
        }

        for(int i=0;i<sum.length;i++){
            if(sum[i] + nums[index] > target) continue;
            sum[i] += nums[index];
            if(dfs(nums,sum,index + 1,target)) return true;
            sum[i] -= nums[index];
        }

        return false;
    }
}