public class Solution {
    public boolean isPerfectSquare(int num) {
        long target = num;
        long start = 1;
        long total = start*start;
        while(total < num){
            start *= 2;
            total = start*start;
        }
        
        if(total == target) return true;
        else{
            start /= 2;
            total = start*start;
            while(total < target){
                start += 1;
                total = start*start;
            }
        }
        
        if(total == target) return true;
        else return false;
    }
}