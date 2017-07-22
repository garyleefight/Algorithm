public class Solution {
    public int searchInsert(int[] nums, int target) {
        return binary(nums,target,0,nums.length-1);
    }
    
    private int binary(int[] nums,int target,int start,int end){
        if(start+1>end){
            if(nums[start] >= target){
                return start;
            }else {
                return start+1; 
            }
        }
        
        int mid = start + (end - start)/2;
        
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid]>target){
            return binary(nums,target,start,mid-1);
        }else{
            return binary(nums,target,mid+1,end);
        }
    }
}