public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        if(needle == null || needle.length() == 0) return 0;
        int res = 0;
        boolean flag = true;
        for(int i=0;i<haystack.length() - needle.length() + 1;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                for(int j=0;j<needle.length();j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag) return i;
                else flag = true;
            }
        }
        return -1;
    }
}