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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> input =  new ArrayList<>();
            dfs(res,input,root,sum);
            return res;
    }
    
    public void dfs(List<List<Integer>> res,List<Integer> input,TreeNode root,int sum){
        if(root == null) return;
        if(root.val == sum && root.left == null && root.right == null){
            input.add(root.val);
            List<Integer> temp = new ArrayList(input);
            res.add(temp);
            input.remove(input.size() - 1);
            return;
        }
        input.add(root.val);
        dfs(res,input,root.left,sum - root.val);
        dfs(res,input,root.right,sum - root.val);
        input.remove(input.size() - 1);
    }
}