public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int low_index = 0;
        int high_index = 0;
        if(prices == null || prices.length == 0) return 0;
        if(prices.length == 1) return 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[low_index]) low_index = i;
            else if(i>low_index){
                int temp = prices[i] - prices[low_index];
                if(max<temp) max = temp;
            }
        }
        return max;
    }
}