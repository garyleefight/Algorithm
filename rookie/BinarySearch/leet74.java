public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int height=matrix.length-1;
        int length=0;
        int max_length=matrix[0].length;
        while(height>=0&&length<max_length){
            if(matrix[height][length]<target){
                length++;
            }else if(matrix[height][length]>target){
                height--;
            }else{
                return true;
            }
        }
        return false;
    }
}

// complexity O(n);