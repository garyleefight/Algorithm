public class Solution {
    public int removeDuplicates(int[] nums) {
       int prev = 0;
       int cur = 1;
       int count = 1;
       boolean flag = false;
       if(nums.length<=2) return nums.length;
       while(cur<nums.length){
           if(nums[prev] == nums[cur]){
               if(flag == false){
                   flag =true;
                   nums[count] = nums[cur];
                   count++;
               }
           }else{
               flag = false;
               nums[count] = nums[cur];
               count++;
           }
           prev++;
           cur++;
       }
       return count;
    }
}