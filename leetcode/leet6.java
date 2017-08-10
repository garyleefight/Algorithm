public class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int length = c.length;
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++) sb[i] = new StringBuilder();
        int i = 0;
        while(i<length){
            for(int row = 0;row<numRows && i<length;row++){
                sb[row].append(c[i++]);
            }
            
            for(int row = numRows - 2; row >= 1 && i<length;row--){
                sb[row].append(c[i++]);
            }
        }
        StringBuilder res = new StringBuilder();
        res.append("");
        for(int j=0;j<sb.length;j++){
            if(sb[j] != null) res.append(sb[j]);
        }
        return res.toString();
    }
}