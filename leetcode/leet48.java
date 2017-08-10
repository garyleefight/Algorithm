public class Solution {
    public void rotate(int[][] matrix) {
        int total = matrix.length - 1;
        int [][] res = new int[matrix.length][matrix.length];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                res[j][total - i] = matrix[i][j];
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
}

