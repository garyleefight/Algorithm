public class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+i>max){
                max = nums[i]+i;
            }
            if(i>max){
                return false;
            }else if(i == max && nums[i] == 0){
                if(max == nums.length-1){
                    return true;
                }else{
                    return false;
                }
            }
            
        }
        if(max >=nums.length-1){
            return true;
        }else{
            return false;
        }
    }
}