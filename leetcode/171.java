public class Solution {
    public int titleToNumber(String s) {
        int length = s.length();
        int total = 0;
        for(int i=length - 1; i >= 0;i--){
            int ex = length - 1 - i;
            total += (int)Math.pow(26,ex)*(s.charAt(i) - 'A' + 1);
        }
        
        return total;
    }
}