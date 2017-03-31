public class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0) return 0;
        int length = s.length();
        char[] c = s.toCharArray();
        int[] count = new int[length];
        count[0] = 1;
        if(c[0] == '0') return 0;
        if(c.length == 1){
            return 1;
        }
        if(c[1] == '0'){
            if(c[0] == '1' || c[0] == '2') count[1] = 1;
            else return 0;
        }
        else{
            if(c[0] == '1') count[1] = 2;
            else if(c[0] == '2'){
                if(c[1] - '0' <= 6) count[1] = 2;
                else count[1] = 1;
            }else count[1] = 1;
        }
        
        for(int i=2;i<length;i++){
            if(c[i] == '0'){
                if(c[i-1] == '1' || c[i-1] == '2') count[i] = count[i-2];
                else return 0;}
            else{
                if(c[i-1] == '1') count[i] = count[i-2] + count[i-1];
                else if(c[i-1] == '2'){
                    if(c[i] - '0' <= 6) count[i] = count[i-2] + count[i-1];
                    else count[i] = count[i-1];
                }else count[i] = count[i-1];
            }
        }
        return count[length-1];
    }
}
// tricky 0....