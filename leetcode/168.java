public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            int re = n%26;
            if(re == 0) {
                sb.insert(0,rchar(26));
                n = n-1;   
            }
            else sb.insert(0,rchar(re));
            n /= 26;
        }
        return sb.toString();
    }
    
    private char rchar(int n){
        char res = (char)(n + 'A' - 1);
        return res;
    }
}