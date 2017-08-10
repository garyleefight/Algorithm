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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        stack1.push(root);
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            List<Integer> input = new ArrayList<>();
            if(!stack1.isEmpty()){
            while(!stack1.isEmpty()){
                TreeNode temp = stack1.pop();
                input.add(temp.val);
                if(temp.left != null) stack2.push(temp.left);
                if(temp.right != null) stack2.push(temp.right);
                }
            res.add(input);
            }
            
            if(!stack2.isEmpty()){
                input = new ArrayList<>();
                while(!stack2.isEmpty()){
                    TreeNode temp = stack2.pop();
                    input.add(temp.val);
                    if(temp.right != null) stack1.push(temp.right);
                    if(temp.left != null) stack1.push(temp.left);
                }
                res.add(input);
            }
        }
        return res;
    }
}