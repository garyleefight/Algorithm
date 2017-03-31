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
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode start = head;
            ListNode end = head;
            ListNode prev_end = dummy;
            ListNode prev = dummy;
            while(end.next != null){
                if(end.val == start.val){
                    if(end == start){
                        prev_end = end;
                        end = end.next;
                        continue;
                    }
                    
                    if(end.next.val != start.val){
                        prev.next = end.next;
                        prev_end = prev;
                        start = prev.next;
                        end = start;
                    }else{
                        prev_end = end;
                        end = end.next;
                    }
                }else{
                    prev = prev_end;
                    start = end;
                }
            }
            
            if(end != start && end.val == start.val){
                    prev.next = end.next;
            }
            return dummy.next;
    }
}