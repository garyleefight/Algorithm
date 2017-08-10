public class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        int[] num = new int[26];
        num[locate('a')] = 1;
        num[locate('s')] = 1;
        num[locate('d')] = 1;
        num[locate('f')] = 1;
        num[locate('g')] = 1;
        num[locate('h')] = 1;
        num[locate('j')] = 1;
        num[locate('k')] = 1;
        num[locate('l')] = 1;
        num[locate('z')] = 2;
        num[locate('x')] = 2;
        num[locate('c')] = 2;
        num[locate('v')] = 2;
        num[locate('b')] = 2;
        num[locate('n')] = 2;
        num[locate('m')] = 2;
        for(int i=0;i<words.length;i++){
            String temp = words[i].toLowerCase();
            int set = num[temp.charAt(0) - 'a'];
            boolean flag = true;
            for(int j=0;j<words[i].length();j++){
                if(num[temp.charAt(j) - 'a'] != set){
                    flag = false;
                    break;
                }
            }
            if(flag) res.add(words[i]);
        }
        String [] re = new String[res.size()];
        res.toArray(re);
        return re;
    }
    
    private int locate(char c){
        return c - 'a';
    }
}