public class Solution {
    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() == 0) return true;
        String first = word.substring(0,1);
        String follow = word.substring(1);
        if(judgeLowerCase(first)){
            return judgeLowerCase(follow);
        }else if(judgeUpperCase(first)){
            return judgeUpperCase(follow) || judgeLowerCase(follow);
        }else{
            return false;
        }
    }
    
    private boolean judgeLowerCase(String word){
        if(word == null || word.length() == 0) return true;
        for(char c:word.toCharArray()){
            int res = c - 'a';
            if(res < 0 || res >= 26) return false;
        }
        return true;
    }
    
    private boolean judgeUpperCase(String word){
        for(char c:word.toCharArray()){
            int res = c - 'A';
            if(res < 0 || res >= 26) return false;
        }
        return true;
    }
}