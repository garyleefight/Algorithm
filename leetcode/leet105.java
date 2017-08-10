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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0) return null;
        return generate(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    
    public TreeNode generate(int[] preorder, int[] inorder, int p_s, int p_e, int i_s, int i_e){
        if(i_s < 0 || i_e > inorder.length - 1 || p_s < 0 || p_e > preorder.length - 1) return null;
        
        if(p_s > p_e || i_s > i_e) return null;
        
        int target = preorder[p_s];
        int mid = 0;
        // find target in inorder
        for(int i=i_s;i <= i_e;i++){
            if(inorder[i] == target){
                mid = i;
                TreeNode root = new TreeNode(inorder[i]);
                root.left = generate(preorder,inorder,p_s+1,p_s+mid-i_s,i_s,mid-1);
                root.right = generate(preorder,inorder,p_s+mid-i_s+1,p_e,mid+1,i_e);
                return root;
            }
        }
        return null;
    }
}