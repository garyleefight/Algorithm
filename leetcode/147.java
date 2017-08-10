/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev_c = dummy;
        ListNode current = head;
        while(current != null){
            ListNode next = current.next;
            ListNode prev = dummy;
            while(prev.next != current && prev.next.val < current.val){
                prev = prev.next;
            }
            if(prev.next != current){
                ListNode end = prev.next;
                prev.next = current;
                current.next = end;
                prev_c.next = next;
            }else{
                prev_c = prev_c.next;
            }
            current = next;
        }
        return dummy.next;
        
    }
}