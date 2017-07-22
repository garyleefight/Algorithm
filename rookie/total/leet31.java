public class Solution {
    public void nextPermutation(int[] nums) {
        int raise_start = 0;
        int down_start = 0;
        for(int j=nums.length-1;j>0;j--){
            if(nums[j]<nums[j-1]){
                raise_start = j;
                break;
            }
        }
        // tricky!!
        if(raise_start != nums.length-1 && nums[raise_start]!=nums[nums.length-1]){
            int change_index=nums.length-1;
            for(int j=nums.length-2;j>0;j--){
                if(nums[j] == nums[nums.length-1]){
                    change_index = j;
                }else{
                    break;
                }
            }
            swap(nums,change_index,change_index-1);
            
        }else{
            for(int j=nums.length-1;j>0;j--){
                if(nums[j]>nums[j-1]){
                    down_start = j;
                    break;
                }
            }
            
            if(down_start == 0){
                reverse(nums,0,nums.length-1);
            }else{
                int standard = nums[down_start-1];
                reverse(nums,down_start,nums.length-1);
                for(int i=down_start;i<nums.length;i++){
                    if(nums[i]>standard){
                        swap(nums,down_start-1,i);
                        break;
                    }
                }
            }
        }
        
        
    }
    
    private void swap(int[] nums,int i1,int i2){
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
    
    private void reverse(int[] nums,int start,int end){
            while(start<end){
            swap(nums,start,end);
            start++;
            end--;
            }
        }
    }
