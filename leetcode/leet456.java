public class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums == null || nums.length < 3) return false;
        int first = 0;
        int second = 0;
        int third = 0;
        while(first < nums.length){
            while(first < nums.length - 1 && nums[first] >= nums[first+1]){
                first = first + 1;
            }
            second = first + 1;
            while(second < nums.length - 1 && nums[second] <= nums[second+1]){
                second = second + 1;
            }
            third = second + 1;
            while(third < nums.length){
                if(nums[third] > nums[first] && nums[third] < nums[second]) return true;
                third++;
            }
            first++;
        }
        return false;
    }
}