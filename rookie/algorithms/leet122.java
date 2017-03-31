public class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
         if(prices == null || prices.length == 0 || prices.length == 1) return 0;
        int min = prices[0];
        int high = prices[0];
       
        for(int i=1;i<prices.length;i++){
            if(prices[i] < high){
                total = total + high - min;
                high = prices[i];
                min = prices[i];
            }else if(prices[i] >= high){
                high = prices[i];
            }
        }
        total += high - min;
        return total;
    }
}