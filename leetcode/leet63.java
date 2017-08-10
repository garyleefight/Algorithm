public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] res = new int[obstacleGrid.length][obstacleGrid[0].length];

        for(int i=0;i<obstacleGrid.length;i++){
            for(int j=0;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j] == 1) res[i][j] = 0;
                else{
                    if(i == 0 && j>0) res[i][j] = res[i][j-1];
                    else if(j == 0 && i>0) res[i][j] = res[i-1][j];
                    else if(i>0 && j>0) res[i][j] = res[i-1][j]+res[i][j-1];
                    else res[i][j] = 1;
                }
            }
        }
        return res[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}