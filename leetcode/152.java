public class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int start = 0;
        int total = max;
        for(int i=1;i<nums.length;i++){
            if(total == 0){
                if(total > max) max = total;
                start = i;
                total = nums[i];
                if(total > max) max = total;
                continue;
            }
            
            if(nums[i] == 0){
                if(total >= 0){
                    if(total > max) max = total;
                }else{
                    for(int j=start;j<i-1;j++){
                        if(nums[j] > 0) total /= nums[j];
                        else{
                            total /= nums[j];
                            if(total > max) max = total;
                            break;
                        }
                    }
                }
                start = i+1;
                total = 0;
            }else{
                total *= nums[i];
                if(total > max) max = total;
            }
        }
        if(total < 0){
            for(int j=start;j<nums.length - 1;j++){
                        if(nums[j] > 0) total /= nums[j];
                        else{
                            total /= nums[j];
                            if(total > max) max = total;
                            break;
                        }
                    }
        }
        
        return max;
    }
}