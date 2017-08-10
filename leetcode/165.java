public class Solution {
    public int compareVersion(String version1, String version2) {
        String [] v1 = version1.split("\\.");
        String [] v2 = version2.split("\\.");
        int i=0;
        while(i<v1.length && i<v2.length){
            long s1 = Long.parseLong(v1[i]);
            long s2 = Long.parseLong(v2[i]);
            if(s1 > s2) return 1;
            else if(s1 < s2) return -1;
            
            i++;
        }
        
        while(i<v1.length){
            if(Long.parseLong(v1[i]) > 0) return 1;
            i++;
        }
        while(i<v2.length){
            if(Long.parseLong(v2[i]) > 0) return -1;
            i++;
        }
        return 0;
    }
}