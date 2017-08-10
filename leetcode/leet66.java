public class Solution {
    public int[] plusOne(int[] digits) {
        int up = 1;
        for(int i=digits.length-1;i>=1;i--){
            if(digits[i] + up> 9){
                digits[i] = 0;
                up = 1;
            }else{
                digits[i] += up;
                up = 0;
                break;
            }
        }
        if(up + digits[0]>9){
            int[] res = new int[digits.length+1];
            digits[0] = 0;
            res[0] = 1;
            for(int i=0;i<digits.length;i++){
                res[i+1] = digits[i];
            }
            return res;
        }else{
            digits[0] += up;
            return digits;
        }
    }
}