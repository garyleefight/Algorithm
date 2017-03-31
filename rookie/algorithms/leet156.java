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
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if(root == null || root.left == null){
            return root;
        } 
        
        TreeNode new_root = upsideDownBinaryTree(root.left);
        TreeNode left = root.left;
        left.right = root;
        left.left = root.right;
        root.right = null;
        root.left = null;
        return new_root;
    }
    
}