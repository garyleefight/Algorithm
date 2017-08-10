/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode small = dummy;
        ListNode cur = dummy;
        Boolean flag = false;
        while(cur != null && cur.next != null){
            ListNode next = cur.next;
            if(cur.next.val >= x){
                cur = cur.next;
            }else{
                if(cur == small){
                    small = small.next;
                    cur = cur.next;
                }else{
                ListNode s_next = small.next;
                cur.next = next.next;
                next.next= small.next;
                small.next = next;
                small = small.next;
                }
            }
           
        }
        return dummy.next;
    }
}