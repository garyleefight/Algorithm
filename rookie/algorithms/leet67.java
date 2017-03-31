public class Solution {
    public String addBinary(String a, String b) {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        StringBuilder sb = new StringBuilder();
        int a_l = a1.length;
        int b_l = b1.length;
        int j = a_l - 1;
        int i = b_l - 1;
        int res = 0;
        int up = 0;
        while(i>=0&&j>=0){
            res = Integer.valueOf(a1[j]+"") + Integer.valueOf(b1[i]+"") + up;
            if(res == 2){
                up = 1;
                sb.insert(0,"0");
            }else if(res == 0){
                up = 0;
                sb.insert(0,"0");
            }else if(res == 1){
                up = 0;
                sb.insert(0,"1");
            }else{
                up = 1;
                sb.insert(0,"1");
            }
            i--;
            j--;
        }
        
        while(i>=0){
            res = Integer.valueOf(b1[i]+"") + up;
            if(res == 2){
                up = 1;
                sb.insert(0,"0");
            }else if(res == 0){
                up = 0;
                sb.insert(0,"0");
            }else{
                up = 0;
                sb.insert(0,"1");
            }
            i--;
        }
        
        while(j>=0){
            res = Integer.valueOf(a1[j]+"") + up;
            if(res == 2){
                up = 1;
                sb.insert(0,"0");
            }else if(res == 0){
                up = 0;
                sb.insert(0,"0");
            }else{
                up = 0;
                sb.insert(0,"1");
            }
            j--;
        }
        if(up == 1) sb.insert(0,"1");
        return sb.toString();
    }
}