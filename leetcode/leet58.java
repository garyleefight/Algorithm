public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int start = s.length();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' ') start = i;
            else break;
        }
        
        for(int i=start-1;i>=0;i--){
            if(s.charAt(i) != ' ') length++;
            else break;
        }
        return length;
    }
}