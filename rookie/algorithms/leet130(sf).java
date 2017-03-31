public class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0) return;
        boolean[][] visit = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j] == 'O' && !visit[i][j]) dfs(i,j,visit,board);
            }
        }
    }
    
    private boolean dfs(int x,int y,boolean[][] visit,char[][] board){
        if(x<0 || y<0 || x > board.length - 1 || y > board[0].length - 1){
            return false;
        }
        
        if(board[x][y] == 'X'){
            return true;
        }
        
        if(visit[x][y]) return false;
        
        visit[x][y] = true;
        board[x][y] = 'X';
        if(dfs(x-1,y,visit,board) && dfs(x,y-1,visit,board) && dfs(x+1,y,visit,board) && dfs(x,y+1,visit,board)){ 
            return true;
        }else{
            board[x][y] = 'O';
            return false;}
    }
}
// StackOverFlow