public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int length = wordList.size();
        int lengthWord = beginWord.length();
        boolean [] mark = new boolean[length];
        int count = 1;
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int k=0;k<size;k++){
                String temp = queue.poll();
                for(int i=0;i<length;i++){
                    if(!mark[i]){
                        String target = wordList.get(i);
                        if(judgeDis1(temp,target,lengthWord)){
                            if(target.equals(endWord)){
                                count++;
                                return count;
                            }
                            queue.offer(target);
                            mark[i] = true;
                            }
                        }
                    }
                }
            count+=1;  
        }
        return 0;
    }
    
    private Boolean judgeDis1(String s1,String s2,int length){
        int count = 0;
        for(int i=0;i<length;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                if(count > 1) return false;
            }
        }
        return true;
    }
}