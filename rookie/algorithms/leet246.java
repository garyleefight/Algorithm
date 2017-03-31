public class Solution {
    public boolean isStrobogrammatic(String num) {
        // 1 2 3 4 5 6 7 8 9 0
        for(int i=0;i <=num.length()- 1 - i;i++){
            char c = num.charAt(i);
            char c_t = num.charAt(num.length()- 1 - i);
            switch(c){
                case '1':
                    if(c_t != '1') return false;
                    break;
                case '6':
                    if(c_t != '9') return false;
                    break;
                case '8':
                    if(c_t != '8') return false;
                    break;
                case '9':
                    if(c_t != '6') return false;
                    break;
                case '0':
                    if(c_t != '0') return false;
                    break;
                default: return false;
            }
        }
        return true;
    }
}