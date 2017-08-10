public class Solution {
    public int mySqrt(int x) {
        long temp = x;
        long i = 0;
        while(i*i <= temp){
            i++;
        }
        return (int)i-1;
    }
}
// slow