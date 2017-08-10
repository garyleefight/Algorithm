public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] temp = new int[gas.length];
        int total = 0;
        for(int i=0;i<temp.length;i++){
            temp[i] = gas[i] - cost[i];
            total += temp[i];
        }
        if(total < 0) return -1;
        int start_index = 0;
        int remain = temp.length;
        int count = 0;
        for(int i=0;i<temp.length;i += 1){
            count += temp[i];
            remain -= 1;
            if(count < 0){
                count = 0;
                start_index = i+1;
            }
        }
        return start_index;
    }
}
