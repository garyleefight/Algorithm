// very bad!!.
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();
        List<Integer> temp;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            if(i>=1 && nums[i]==nums[i-1]){
                continue;
            }
            
            for(int j=i+1;j<nums.length;j++){

                if(map.containsKey(0-nums[i]-nums[j])){
                    int index = map.get(0-nums[i]-nums[j]);
                    if(index<=j){
                        continue;
                    }
                    
                    if(nums[i] == nums[j] && j-i>1){
                        continue;
                    }
                    
                    if(nums[j] == nums[j-1] && nums[i]!=nums[j-1]){
                        continue;
                    }
                    
                    temp = new ArrayList();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[index]);
                    res.add(temp);
                }
            }
        }
        
        return res;
    }
}