/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int promote = 0;
        while(l1 != null && l2 != null){
            int total = l1.val + l2.val + promote;
            promote = 0;
            while(total >= 10){
                promote += 1;
                total -= 10;
            }
            ListNode temp = new ListNode(total);
            current.next = temp;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int total = l1.val + promote;
            promote = 0;
            while(total >= 10){
                promote += 1;
                total -= 10;
            }
            ListNode temp = new ListNode(total);
            current.next = temp;
            current = current.next;
            l1 = l1.next;
        }

        while(l2 != null){
            int total = l2.val + promote;
            promote = 0;
            while(total >= 10){
                promote += 1;
                total -= 10;
            }
            ListNode temp = new ListNode(total);
            current.next = temp;
            current = current.next;
            l2 = l2.next;
        }
        
        if(promote > 0) current.next = new ListNode(promote);
        
        ListNode head = dummy.next;
        dummy.next = null;
        return reverse(head);
    }
    
    private ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode next = head.next;
        ListNode new_head = reverse(head.next);
        next.next = head;
        head.next = null;
        return new_head;
    }
}