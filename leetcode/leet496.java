public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        HashMap<Integer,Integer> store = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] > nums[i]){
                    store.put(nums[i],nums[j]);
                    break;
                }
            }
        }
        int[] res = new int[findNums.length];
        for(int i=0;i<findNums.length;i++){
                if(store.containsKey(findNums[i])){
                    res[i] = store.get(findNums[i]);
                }else{
                    res[i] = -1;
                }
        }
        return res;
    }
}