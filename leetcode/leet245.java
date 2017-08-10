public class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int min = Integer.MAX_VALUE;
        if(!word1.equals(word2)){
        int index_1 = -1;
        int index_2 = -1;
        for(int i=0;i<words.length;i++){
            int temp = min;
            if(words[i].equals(word1)){
                if(index_2 >= 0){
                    index_1 = i;
                    temp = index_1 - index_2;
                    min = temp<min?temp:min;
                }else{
                    index_1 = i;
                }
            }else if(words[i].equals(word2)){
                if(index_1 >= 0){
                    index_2 = i;
                    temp = index_2 - index_1;
                    min = temp<min?temp:min;
                }else{
                    index_2 = i;
                }
            }
        }
        }else{
            int index = -1;
            for(int i=0;i<words.length;i++){
                if(words[i].equals(word1)){
                    if(index < 0){
                        index = i;
                    }else{
                        int temp = i - index;
                        min = temp<min?temp:min;
                        index = i;
                    }
                }
            }
        }
        return min;
    }
}