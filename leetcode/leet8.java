public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0) return 0;
        long res = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        boolean signal = true;
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(0) != ' ') break;
            else str = str.substring(1,str.length());
        }
        
        int length = str.length();
        
        if(str.charAt(0) == '-'){
            signal = false;
            str = str.substring(1,length);
        }else if(str.charAt(0) == '+'){
            signal = true;
            str = str.substring(1,length);
        }
        
        length = str.length();
        
        for(int i=0;i<length;i++){
            if(str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9){
                if(signal){
                    res *= 10;
                    res += (str.charAt(i) - '0');
                    if(res > max) return max;
                }else{
                    res *= 10;
                    res -= (str.charAt(i) - '0');
                    if(res < min) return min;
                }
            }
            else return (int)res;
        }
        
        return (int)res;
        
    }
}