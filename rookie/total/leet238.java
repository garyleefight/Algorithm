public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[nums.length-1] = 1;
        for(int i=nums.length-2;i>=0;i--){
            res[i] = nums[i+1]*res[i+1];
        }
        
        int left=1;
        for(int i=1;i<nums.length;i++){
            left = nums[i-1]*left;
            res[i] = left*res[i];
        }
        return res;
    }
}