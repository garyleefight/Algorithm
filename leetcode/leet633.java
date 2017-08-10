public class Solution {
    public boolean judgeSquareSum(int c){
        if(c < 0) return false;
        int left = 0;
        int right = (int)Math.sqrt(c);
        int total = 0;
        while(left <= right){
            total = left*left + right*right;
            if(total < c){
                left ++ ;
            }else if(total > c) right --;
            else return true;
        }
        return false;
    }   
}