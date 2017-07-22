public class Solution {
    public int[] searchRange(int[] nums, int target) {
        return binary(nums,target,0,nums.length-1);
        
    }
    
    private int[] binary(int[]nums,int target,int start,int end){
        int[] res;

        if(start+1>=end){
            res = new int[2];
            if(nums[start]!=target && nums[end]!=target){
                res[0] = -1;
                res[1] = -1;
            }else if(nums[start] != target){
                    res[0] = end;
                    res[1] = end;
            }else if(nums[end] != target){
                    res[0] = start;
                    res[1] = start;
            }else{
                res[0] = start;
                res[1] =end;
            }
            return res;
        }
        
       if(nums[start] == target && nums[end] == target){
            res = new int[2];
            res[0] = start;
            res[1] = end;
            return res;
        }
        
        
        int mid = (end - start)/2 + start;
        if(nums[mid]>target){
            res = binary(nums,target,start,mid-1);
        }else if(nums[mid]<target){
            res = binary(nums,target,mid+1,end);
        }else{
            int res_start = mid;
            int res_end = mid;
            for(int i = mid;i<nums.length;i++){
                if(nums[i] != target){
                    break;
                }
                res_end = i;
            }
            
            for(int i = mid;i>=0;i--){
                if(nums[i] != target){
                    break;
                }
                res_start = i;
            }
                    res = new int[2];
                    res[0] = res_start;
                    res[1] = res_end;
                    return res;
        }
        return res;
    }
    
}