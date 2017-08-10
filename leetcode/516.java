public class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] target = new int[s.length()][s.length()];
        for(int i=0;i<target.length;i++){
            target[i][i] = 1;
        }
        for(int length=1;length < target.length;length++){
            for(int i=0;i<target.length - length;i++){
                if(s.charAt(i) == s.charAt(i + length)){
                    target[i][i + length] = Math.max((2 + target[i+1][i+length-1]), Math.max(target[i+1][i+length],target[i][i+length-1]));
                }else{
                    target[i][i + length] = Math.max(target[i+1][i+length],target[i][i+length-1]);
                }
            }
        }
        return target[0][target.length-1];
    }
}