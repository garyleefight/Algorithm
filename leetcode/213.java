public class Solution {
    public int rob(int[] nums) {
    	if(nums.length == 0) return 0;
    	if(nums.length == 1) return nums[0];
 		return Math.max(rob1(nums,1,nums.length-1),rob1(nums,0,nums.length-2));

    }

    private int rob1(int[] nums,int start,int end){
    	int[] max = new int[end - start + 1];
    	max[0] = nums[start];
    	if(end - start + 1 == 1) return nums[start];
    	max[1] = Math.max(nums[start],nums[start + 1]);
    	for(int i=2;i<end - start + 1;i++){
    		max[i] = Math.max(max[i-2] + nums[i + start],max[i-1]);
    	}
    	return max[end - start];
    }
}