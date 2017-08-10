public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        boolean flag = false;
        if(strs == null || strs.length == 0) return "";
        while(index < strs[0].length()){
            char temp = strs[0].charAt(index);
            for(int i=0;i<strs.length;i++){
                if(index<strs[i].length()){
                    if(strs[i].charAt(index) != temp){
                        flag = true;
                        break;
                    }
                }else{
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            index++;
        }
        return strs[0].substring(0,index);
    }
}