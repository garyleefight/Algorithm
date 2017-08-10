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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                TreeNode temp = cur;
                stack.push(temp);
                cur = cur.left;
            }
            TreeNode head = stack.peek();
            if(head.right == null) {
                res.add(head.val);
                stack.pop();
            }
            else {
                cur = head.right;
                TreeNode temp = cur;
                head.right = null;
                }
        }
        return res;
    }
}