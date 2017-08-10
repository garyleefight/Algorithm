public class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k == 0) return;
        int[] temp = new int[k];
        int start = nums.length - k;
        for(int i=start;i<nums.length;i++){
            temp[i-start] = nums[i];
        }
        
        for(int i=start-1;i>=0;i--){
            nums[i+temp.length] = nums[i];
        }
        for(int i=0;i<temp.length;i++) nums[i] = temp[i];
    }
}