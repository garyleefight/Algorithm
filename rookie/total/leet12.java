public class Solution {
    public String intToRoman(int num) {
        String res = "";
        String[] rArray = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] number = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        for(int i=0; i<rArray.length; i++){
            if(num/number[i]>0){                
                for(int j=0;j<num/number[i];j++){
                    res += rArray[i];
                }
                num %= number[i];
            }
        }
        
        return res;
        
        
    }
    
    
}