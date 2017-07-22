public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k,new Comparator<Integer>(){
            @Override
            public int compare(Integer i1,Integer i2){
                return i1-i2;
            }
            
        });
        for(int i=0;i<nums.length;i++){
            if(queue.size()<k) queue.offer(nums[i]);
            else if(queue.peek()<=nums[i]){
                queue.poll();
                queue.offer(nums[i]);
            }
        }
        return queue.poll();
    }
}