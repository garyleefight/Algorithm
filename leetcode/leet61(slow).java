/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode new_head = null;
        
        if(head == null){
            return head;
        }
        
        int length = 0;
        while(fast != null){
            fast = fast.next;
            length++;
        }
        fast = head;
        k = k%length;
        int count = 0;
        while(count<k){
            count++;
            fast = fast.next;
        }
        
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        fast.next = head;
        new_head = slow.next;
        slow.next = null;
        return new_head;
    }
}