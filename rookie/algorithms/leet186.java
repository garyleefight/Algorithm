public class Solution {
    public void reverseWords(char[] s) {
        if(s == null || s.length == 0) return;
        int start = 0;
        reverse(s,s.length-1,start);
        for(int i=0;i<s.length;i++){
            if(s[i] == ' '){
                reverse(s,i-1,start);
                start = i+1;
            }
        }
        reverse(s,s.length-1,start);
    }
   private void reverse(char[] s,int end,int start){
        for (int i = 0; i  < (end - start) - i; i++) {
            char temp = s[i + start];
            s[i + start] = s[end - i];
            s[end - i] = temp;
        }
    }
}