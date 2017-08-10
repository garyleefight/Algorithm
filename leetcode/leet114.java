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
    public void flatten(TreeNode root) {
            change(root);
    }
    
    public TreeNode change(TreeNode root){
        if(root == null) return null;
        if(root.left != null){
            TreeNode right = root.right;
            root.right = root.left;
            root.left = null;
            TreeNode last = change(root.right);
            if(right != null){
            last.right = right;
            return change(right);}
            else return last;
        }else if(root.right != null){
            return change(root.right);
        }else return root;
        
    }
}