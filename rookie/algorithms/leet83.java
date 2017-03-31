/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode current = head.next;
        ListNode prev = head;
        while(current != null){
            if(current.val == prev.val){
                prev.next = current.next;
                current = current.next;
            }else{
                current = current.next;
                prev = prev.next;
            }
        }
        return head;
    }
}