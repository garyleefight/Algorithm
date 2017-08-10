public class Solution {
    public String countAndSay(int n) {
        if(n == 0) return null;
        String s = "1";
        while(n>1){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i) == s.charAt(i-1)) count++; 
                else{
                    sb.append(""+count+s.charAt(i-1));
                    count = 1;
                }
            }
            sb.append("" +count+s.charAt(s.length()-1));
            s = sb.toString();
            n--;
        }
        return s;
    }
}