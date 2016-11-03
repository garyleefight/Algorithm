/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode current=head;
        if(head==null){
            return head;
        }
        
        HashMap<RandomListNode,RandomListNode> hash=new HashMap();
        while(current.next!=null){
            RandomListNode new_node=null;
            if(!hash.containsKey(current)){
                new_node=new RandomListNode(current.label);
            }else{
                new_node=hash.get(current);
            }
            
            if(!hash.containsKey(current.next)){
                    RandomListNode new_next=new RandomListNode(current.next.label);
                    hash.put(current.next,new_next);
                    new_node.next=new_next;
                }else{
                    new_node.next=hash.get(current.next);
                }
                
                if(current.random!=null){
                if(!hash.containsKey(current.random)){
                    RandomListNode new_random=new RandomListNode(current.random.label);
                    hash.put(current.random,new_random);
                    new_node.random=new_random;
                }else{
                    new_node.random=hash.get(current.random);
                }
                    
                }
                hash.put(current,new_node);
                current=current.next;
        }
             RandomListNode new_node=null;
            if(!hash.containsKey(current)){
                new_node=new RandomListNode(current.label);
            }else{
                new_node=hash.get(current);
            }
            
            if(current.random!=null){
                if(!hash.containsKey(current.random)){
                    RandomListNode new_random=new RandomListNode(current.random.label);
                    hash.put(current.random,new_random);
                    new_node.random=new_random;
                }else{
                    new_node.random=hash.get(current.random);
                }
                }
        hash.put(current,new_node);
        return hash.get(head);
    }
}