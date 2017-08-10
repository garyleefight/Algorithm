public class Solution {
    public boolean exist(char[][] board, String word) {
        int height = board.length;
        if(height == 0 || board[0].length == 0) return false;
        int width = board[0].length;
        boolean[][] visit = new boolean[height][width];
        List<Character> input = new ArrayList<>();
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(word.charAt(0) == board[i][j]){
                     if(dfs(board,word,visit,i,j,input,0)) return true;
                }
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] board,String word,boolean[][] visit,int x,int y,List<Character> input,int index){
        int height = board.length;
        int width = board[0].length;
        
        
        if(index < word.length()){
            if(x < 0 || y < 0 || x > height -1 || y > width - 1) return false;
            if(visit[x][y] == true) return false;
            if(board[x][y] == word.charAt(index)){
                input.add(board[x][y]);
                index++;                                    
                visit[x][y] = true;
                boolean res = false;
                if(dfs(board,word,visit,x+1,y,input,index)||dfs(board,word,visit,x-1,y,input,index)||dfs(board,word,visit,x,y+1,input,index)||dfs(board,word,visit,x,y-1,input,index)){
                    res = true;
                }
                input.remove(input.size() - 1);
                visit[x][y] = false;
                return res;
            }else return false;
        }else if(index == word.length()) return true;
        else return false;
    }
}