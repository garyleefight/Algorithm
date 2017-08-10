public class Solution {
    public String reverseString(String s) {
        if (s == null || s.length() == 0) return s;
        char[] c = s.toCharArray();
        for(int i=0;i<=(c.length-1)/2;i++){
            char temp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = temp;
        }
        return String.valueOf(c);
    }
}