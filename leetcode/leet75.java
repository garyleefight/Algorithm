public class Solution {
    public void sortColors(int[] nums) {
        int p_0 = 0;
        int p_2 = nums.length - 1;
        int temp = 0;
        for(int i=0;i<=p_2 && p_0 < p_2;){
            if(nums[i] == 0 && i>= p_0){
               temp = nums[p_0];
               nums[p_0] = nums[i];
               nums[i] = temp;
               p_0 ++;
            }else if(nums[i] == 2){
                temp = nums[p_2];
                nums[p_2] = nums[i];
                nums[i] = temp;
                p_2 --;
            }else{
                i++;
            }  
        }
    }
}