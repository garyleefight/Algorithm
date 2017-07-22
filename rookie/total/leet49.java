public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap();
        List<String> key = new ArrayList();
        List<List<String>> res = new ArrayList();
        String s;
        if(strs == null || strs.length == 0){
            return res;
        }

        for(int i=0;i<strs.length;i++){
                //String method! Important!
                char[] temp = strs[i].toCharArray();
                Arrays.sort(temp);
                s = new String(temp);

            if(!map.containsKey(s)){
                List list = new ArrayList();
                list.add(strs[i]);
                map.put(s,list);
                key.add(s);
            }else{
                map.get(s).add(strs[i]);
            }
        }

        for(String i:key){
            res.add(map.get(i));
        }

        return res;
    }
}