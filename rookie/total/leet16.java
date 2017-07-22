public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int i=0;i<nums.length-1;i++){
            int start = i+1;
            int end = nums.length-1;
            int sum_t = target - nums[i];
            while(start<end){
                int sum = nums[start]+nums[end];
                if(sum_t-sum>0){
                    start++;
                }else if(sum_t-sum<0){
                    end--;
                }else{
                    return target;
                }
                
                if(absolute(sum_t-sum)<min){
                    min = absolute(sum_t-sum);
                    res = sum-sum_t+target;
                }
            }
        }
        return res;
    }
    
    private int absolute(int num){
        if(num<0){
            num = -num;
        }
        return num;
    }
}