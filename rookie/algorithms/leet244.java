public class WordDistance {
    HashMap<String,List<Integer>> map;
    public WordDistance(String[] words) {
        map = new HashMap();
        for(int i=0;i<words.length;i++){
            List<Integer> temp;
            if(!map.containsKey(words[i])){
                temp = new ArrayList();
                temp.add(i);
                map.put(words[i],temp);
            }else{
                temp = map.get(words[i]);
                temp.add(i);
                map.put(words[i],temp);
            }
        }
    }
    
    public int shortest(String word1, String word2) {
        List<Integer> list1 = map.get(word1);
        List<Integer> list2 = map.get(word2);
        int i=0;
        int j=0;
        int min = Integer.MAX_VALUE;
        int size1 = list1.size();
        int size2 = list2.size();
        while(i<size1 && j<size2){
            int index1 = list1.get(i);
            int index2 = list2.get(j);
            int temp;
            if(index1 < index2){
                temp = index2 - index1;
                min = temp<min?temp:min;
                i++;
            }else{
                temp = index1 - index2;
                min = temp<min?temp:min;
                j++;
            }
        }
        if(i == size1){
            int index_1 = list1.get(size1-1);
            while(j<size2){
                int temp = Math.abs(index_1-list2.get(j));
                min = temp<min?temp:min; 
                j++;
            }
        }else{
            int index_2 = list2.get(size2-1);
            while(i<size1){
                
                int temp = Math.abs(index_2-list1.get(i));
                min = temp<min?temp:min;
                i++;
            }
        }
        
        return min;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */