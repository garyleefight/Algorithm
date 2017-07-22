public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1 + l2 != s3.length()) return false;
        boolean[][] cache = new boolean[l1+1][l2+1];
        for(int i=0;i<=l1;i++){
            for(int j=0;j<=l2;j++){
                if(i==0 && j==0) {
                    cache[0][0] = true;
                }else if(j==0){
                    cache[i][j] = cache[i-1][j] && (s1.charAt(i-1) == s3.charAt(i+j-1));
                }else if(i==0){
                    cache[i][j] = cache[i][j-1] && (s2.charAt(j-1) == s3.charAt(i+j-1));
                }else{
                    cache[i][j] = (cache[i][j-1] && (s2.charAt(j-1) == s3.charAt(i+j-1))) || (cache[i-1][j] && (s1.charAt(i-1) == s3.charAt(i+j-1)));
                }
            }
        }
        return cache[l1][l2];
    }
}