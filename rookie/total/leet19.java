/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        n = n-1;
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        while(n>0){
            fast = fast.next;
            n--;
        }
        while(fast.next != null){
            fast = fast.next;
            dummy = dummy.next;
            slow = slow.next;
        }
        
       dummy.next = slow.next;
       if(slow == head){
            if(slow.next != null){
                return slow.next;
            }else{
                return null;
            }    
       }
       
        return head;
    }
}