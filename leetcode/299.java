public class Solution {
    public String getHint(String secret, String guess) {
        int length = secret.length();
        int com = 0;
        int[] num = new int[10];
        for(int i=0;i<length;i++){
            if(secret.charAt(i) == guess.charAt(i)) com++;
            else{
                num[trans(secret.charAt(i))]++;
                num[trans(guess.charAt(i))]--;
            }
        }
        int total = 2*length - 2*com;
        for(int i=0;i<num.length;i++){
            total -= Math.abs(num[i]);
        }
        int res = total/2;
        return ""+com+"A"+res+"B";
    }
    
    private int trans(char c){
        return c - '0';
    }
}