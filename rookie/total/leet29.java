// difficulties: 1. use long to handle INTEGER.MAX = 2^32 -1; INTEGER.MIN =- 2^32;
//               2. use binary to speed up;

public class Solution {
        public int divide(int dividend, int divisor) {
        int flag = 1;
        long temp_dividend = dividend;
        long temp_divisor = divisor;
        long res = 0;
        if(temp_divisor == 0){
            return Integer.MAX_VALUE;
        }

        if(dividend == 0){
            return 0;
        }else if(temp_dividend < 0){
            temp_dividend = -temp_dividend;
            flag = -1;
        }else{
            flag = 1;
        }

        if(temp_divisor < 0){
            temp_divisor = -temp_divisor;
            flag *= -1;
        }
        
        res = div(temp_dividend,temp_dividend,temp_divisor,0);
        
        if(flag <0){
            res = -res;
        }
        
         if(res>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(res<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else{
            return (int)res;
        }
    }
    
    private long div(long rem,long temp_dividend, long temp_divisor,long i_in){
        long i = 0;
        long last_sum = 0;
        long sum = temp_divisor;
        long res = 0;
        while(sum <= rem){
            last_sum  = sum;
            sum += sum;
            if(i == 0){
                i = 1;
            }else{
                i+=i;
            }
        }
        
        if(rem - last_sum >= temp_divisor){
            res =  div(rem - last_sum,temp_dividend,temp_divisor,i+i_in);
        }else{
            res =  i+i_in;
        }
        return res;
    }
    
}