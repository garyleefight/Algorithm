/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int start=0;
        int end=nums.length-1;
        if(nums.length==0){
           return null;
        }
        
        return sort(nums,start,end);
    }
    
    private TreeNode sort(int []nums,int start,int end){
        if(start+1>end){
            TreeNode tr=new TreeNode(nums[start]);
            return tr;
        }
        
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(nums[mid]);
        if(mid!=start){
        root.left=sort(nums,start,mid-1);}
        else{
            root.left=null;
        }
        if(mid!=end){
        root.right=sort(nums,mid+1,end);}
        else{
           root.right=null;
        }
        return root;
    }
}