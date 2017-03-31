public class Solution {
    public boolean isOneEditDistance(String s, String t) {
        if(s.length() == t.length()){
            boolean flag = false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) != t.charAt(i)){
                    if(flag == false) flag = true;
                    else return false;
                }
            }
            if(flag == false) return false;
            else return true;
        }else if(s.length() - t.length() == 1){
            int s_index = -1;
            for(int i=0;i<t.length();i++){
                if(t.charAt(i) != s.charAt(i)){
                    s_index = i;
                    break;
                }
            }
            if(s_index < 0 ) return true;
            for(int i=s_index;i<t.length();i++){
                if(t.charAt(i) != s.charAt(i+1)) return false;
            }
            
        }else if(t.length() - s.length() == 1){
            int s_index = -1;
            for(int i=0;i<s.length();i++){
                if(t.charAt(i) != s.charAt(i)){
                    s_index = i;
                    break;
                }
            }
            if(s_index < 0 ) return true;
            for(int i=s_index;i<s.length();i++){
                if(s.charAt(i) != t.charAt(i+1)) return false;
            }
           
        }else return false;
        
        return true;
    }
}