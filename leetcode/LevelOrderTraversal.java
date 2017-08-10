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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList();
        Queue<TreeNode> queue2=new LinkedList();
        List<List<Integer>> t_list=new LinkedList();
        if(root==null){
            return t_list;
        }
        queue.add(root);
        while(!queue.isEmpty()||!queue2.isEmpty()){
            List<Integer> list=new LinkedList();
            while(!queue.isEmpty()){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue2.add(node.left);
                }
                if(node.right!=null){
                    queue2.add(node.right);
                }
                list.add(node.val);
            }
            
            if(!list.isEmpty()){
                t_list.add(list);
                continue;
            }
            
            while(!queue2.isEmpty()){
                TreeNode node1=queue2.poll();
                if(node1.left!=null){
                    queue.add(node1.left);
                }
                if(node1.right!=null){
                    queue.add(node1.right);
                }
                list.add(node1.val);
            }
            if(!list.isEmpty()){
                t_list.add(list);   
            }
        }
        return t_list;
    }
}