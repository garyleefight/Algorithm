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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(height(root) - height(root.left) > 2 || height(root) - height(root.right) > 2) return false;
        if(isBalanced(root.left) && isBalanced(root.right)) return true;
        return false;
    }
    
    private int height(TreeNode root){
        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right)) + 1;
    }
}