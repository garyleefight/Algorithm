public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       int[] hash = new int[256];
       List<Integer> list = new ArrayList();
       for(int i=0;i<p.length();i++){
           hash[p.charAt(i)]++;
       }
       
       int start = 0;
       int end = 0;
       int bound = s.length();
       int target = p.length();
       while(end<bound){
           char right = s.charAt(end);
           char left = s.charAt(start);
           hash[right]--;
           if(hash[right]>=0) target--;
           if(end-start+1 == p.length()){
               if(target == 0) list.add(start);
               if(hash[left]>=0) target++;
               hash[left]++;
               start++;
           }
           end++;
       }
       return list;
    }
}