public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        int low = lower;
        List<String> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] > low){
                int high = nums[i] - 1;
                String s;
                if(high == low){
                    s = "" + low;
                    res.add(s);
                }else{
                    s = low + "->" + high;
                    res.add(s);
                }
                if(nums[i] < upper){
                low = nums[i] + 1;}
                else low = nums[i];
            }else if(low < upper && nums[i] == low) low += 1;
        }
        String s;
        if(upper == low){
            if(nums.length == 0 || upper != nums[nums.length-1]){
                s = "" + low;
                res.add(s);
            }
        }else if(upper > low){
            s = low + "->" + upper;
            res.add(s);
        }
         
        return res;
    }
}