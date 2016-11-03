public class Solution {
    public int maxSubArray(int[] nums) {
        int cur_sum=0;
        int max_sum=nums[0];
        for(int i=0;i<nums.length;i++){
            if((cur_sum+nums[i]>0)){
                cur_sum+=nums[i];
                if(cur_sum>max_sum){
                    max_sum=cur_sum;
                }
            }else{
                if(cur_sum+nums[i]>max_sum){
                    max_sum=cur_sum+nums[i];
                }
                cur_sum=0;
            }
        }
        return max_sum;
    }
}
// leetcode 53