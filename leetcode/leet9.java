public class Solution {
    public boolean isPalindrome(int x) {
        int res  = 0;
        int temp = x;
        if(x<0) return false;
        while(temp/10 > 0){
            res = res*10 + temp%10;
            temp = temp/10;
        }
        res = res*10 + temp%10; 
        return res == x?true:false;
    }
}