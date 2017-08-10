public class Solution {
    public int removeElement(int[] nums, int val) {
        int length = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                length++;
                nums[length-1] = nums[i];
            }
        }
        return length;
    }
}