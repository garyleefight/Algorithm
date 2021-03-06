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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traverse(root,res);
        return res;
    }
    
    private void traverse(TreeNode root, List<Integer> res){
        if(root == null) return;
        res.add(root.val);
        traverse(root.left,res);
        traverse(root.right,res);
    }
}