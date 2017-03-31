// Note: HashMap can not use get(key) += 1 to override the key value directly.
public class TwoSum {
    HashMap<Integer,Integer> n_count;
    HashMap<Integer,Integer> index_n;
    int length;
    /** Initialize your data structure here. */
    public TwoSum() {
        n_count = new HashMap<>();
        index_n = new HashMap<>();
        length = 0;
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        index_n.put(length,number);
        if(n_count.containsKey(number)){
            n_count.put(number,n_count.get(number)+1);
        }else{
            n_count.put(number,1);
        }
        length++;
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for(int i=0;i<length;i++){
            int num_1 = index_n.get(i);
            int target = value - num_1;
            if(num_1 == target){
                if(n_count.get(num_1) > 1) return true;
            }else{
                if(n_count.containsKey(target)) return true;
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */