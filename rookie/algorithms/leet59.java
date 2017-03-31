public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int left = -1; 
        // tricky set left = -1;
        int right = n-1;
        int up = 0;
        int down = n-1;
        int count = 1;
        while(left <= right ){
            for(int i=left+1;i<=right;i++){
                nums[up][i] = count++;
            }
            left++;
            if(up<=down){
                for(int i=up+1;i<=down;i++){
                    nums[i][right] = count++;
                }
            up++;
            }else break;
            if(left<=right){
                for(int i=right-1;i>=left;i--){
                    nums[down][i] = count++;
                }
            right--;
            }else break;
            if(up<=down){
               for(int i=down-1;i>=up;i--){
                   nums[i][left] = count++;
               } 
            down--;
            }else break;
        }
        return nums;
    }
}