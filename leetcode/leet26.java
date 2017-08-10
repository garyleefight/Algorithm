public class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int length = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                length++;
                nums[length-1] = nums[i];
            }
        }
        return length;
    }
}