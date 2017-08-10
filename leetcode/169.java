public class Solution {
    public int majorityElement(int[] nums) {
        int limit = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<limit;i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i]) + 1 > limit/2) return nums[i];
                map.put(nums[i],map.get(nums[i]) + 1);
            }else{
                if(1 > limit/2) return nums[i];
                map.put(nums[i],1);
            }
        }
        return 0;
    }
}