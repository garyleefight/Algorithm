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
    public int sumNumbers(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        dfs(res,sum,root);
        for(int i=0;i<res.size();i++){
            sum += res.get(i);
        }
        return sum;
    }
    private void dfs(List<Integer> res,int sum,TreeNode root){
        if(root == null) return;
        if(root.left ==null && root.right == null){
            int temp = sum*10 + root.val;
            res.add(temp);
        }
        
        if(root.left != null){
            dfs(res,sum*10+root.val,root.left);
        }
        
        if(root.right != null){
            dfs(res,sum*10+root.val,root.right);
        }
    }
}