public class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        return find(nums,start,end,target);
    }
    
    private int find(int[] nums,int start,int end,int target){
        if(start+1>=end){
            if(nums[start]==target){
                return start;
            }
            if(nums[end]==target){
                return end;
            }
            return -1;
        }
        
        int mid=start+(end-start)/2;
        if(nums[mid]>nums[start]){
            if(nums[mid]>target){
                if(target>nums[start]){
                    return find(nums,start,mid,target);
                }else if(target<nums[start]){
                    return find(nums,mid,end,target);
                }else{
                    return start;
                }
            }else if(nums[mid]<target){
                return find(nums,mid,end,target);
            }else{
                return mid;
            }
        }else{
            if(nums[mid]<target){
                if(target<nums[end]){
                    return find(nums,mid,end,target);
                }else if(target>nums[end]){
                    return find(nums,start,mid,target);
                }else{
                    return end;
                }
            }else if(nums[mid]>target){
                return find(nums,start,mid,target);
            }else{
                return mid;
            }
        }
    }
}