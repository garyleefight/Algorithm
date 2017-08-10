/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode mid_pre=findleft(head);
        ListNode mid=mid_pre.next;
        
        // Conner case!! 
        if(mid_pre==null){
            return null;
        }
        if(mid==null){
            return new TreeNode(mid_pre.val);
        }
        
        TreeNode root=new TreeNode(mid.val);
        mid_pre.next=null;
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(mid.next);
        return root;
        
    }
    
    private ListNode findleft(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode pre=head;
        while(fast.next!=null){
            fast=fast.next;
            if(fast==null){
                break;
            }
            fast=fast.next;
            if(fast==null){
                break;
            }
            pre=slow;
            slow=slow.next;
        }
        return pre;
    }
}