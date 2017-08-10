/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null) return;
        Integer count = 0;
        ListNode current = head;
        HashMap<Integer,ListNode> map = new HashMap<>();
        while(current != null){
            map.put(count+1,current);
            current = current.next;
            count++;
        }
        Integer time = count/2;
        for(int i=0;i<time;i++){
            ListNode front = map.get(i+1);
            ListNode next = front.next;
            ListNode last = map.get(count-i);
            front.next = last;
            last.next = next;
            if(i == times - 1) next.next = null;
        }
    }
}

/*0.97,,,,*/