public class Solution {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        while(num/2 != 0){
            sb.append(num%2);
            num /= 2;
        }
        sb.append(num%2);
        
        int sum = 0;
        String res = sb.toString();
        for(int i=0;i<res.length();i++){
            if(res.charAt(i) == '0') sum += Math.pow(2,i)*1;
        }
        return sum;
    }
}