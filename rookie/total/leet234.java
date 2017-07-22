/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        if(head.next == null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = slow.next; 
        ListNode last = pre.next;
        while(last != null){
            pre.next = last.next;
            last.next = slow.next;
            slow.next = last;
            last = pre.next;
        }
        
        ListNode start_s = slow.next;
        ListNode start_f = head;
        while(start_s != null){
            if(start_f.val != start_s.val) return false;
            start_s = start_s.next;
            start_f = start_f.next;
        }
        return true;
        
    }
}