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
        ListNode current = head;

        if(head == null){
            return head;
        }
        
        int length = 1;
        while(current.next != null){
            current = current.next;
            length++;
        }
        current.next = head;
        k = k%length;
        k = length - k;
        
        while(0<k){
            k--;
            current = current.next;
        }
        
        head = current.next;
        current.next = null;
        return head;
    }
}