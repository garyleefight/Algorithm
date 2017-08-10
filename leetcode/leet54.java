public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // 0,0 - 0,1 - 0,2 bound_right = 1; -> 1,2 - 2,2 bound_down = 1;-> 2,1 - 2,0 bound_left = 1 -> -1,0 bound_up = 1; - 1,1
        List<Integer> res = new ArrayList();
        if(matrix.length == 0 || matrix[0].length ==0){
            return res;
        }
        int bound_right = matrix[0].length - 1;
        int bound_down = matrix.length - 1;
        int bound_left = 0;
        int bound_up = 1;

        change_index(res,matrix,0,0,0,bound_right,bound_down,bound_left,bound_up);
        return res;
    }

    private void change_index(List<Integer> res,int[][] matrix,int direction,int x,int y,int bound_right,int bound_down,int bound_left,int bound_up){
        if(direction == 0){
            // left
            while(x <= bound_right){
                res.add(matrix[y][x]);
                x++;
            }
            if(bound_right > 0){
                bound_right--;}
            direction++;
            if(y+1 <= bound_down){
            change_index(res,matrix,direction,x-1,y+1,bound_right,bound_down,bound_left,bound_up);}
            else{
                return;
            }
            // do down!!
        }else if(direction == 1){
            // down
            while(y <= bound_down){
                res.add(matrix[y][x]);
                y++;
            }
            if(bound_down>0){
                bound_down--;}
            direction++;
            if(x-1>=bound_left){
            change_index(res,matrix,direction,x-1,y-1,bound_right,bound_down,bound_left,bound_up);}
            else{
                return;
            }
        }else if(direction == 2){
            // left
            while(x >= bound_left){
                res.add(matrix[y][x]);
                x--;
            }
            if(bound_left<matrix[0].length-1){
                bound_left++;}
            direction++;
            if(y-1>=bound_up){
            change_index(res,matrix,direction,x+1,y-1,bound_right,bound_down,bound_left,bound_up);}else{
                return;
            }
        }else if(direction == 3){
            // up
            while(y >= bound_up){
                res.add(matrix[y][x]);
                y--;
            }
            if(bound_up<matrix.length-1){
                bound_up++;}
            direction = 0;
            if(x+1 <= bound_right){
            change_index(res,matrix,direction,x+1,y+1,bound_right,bound_down,bound_left,bound_up);}else{
                return;
            }
        }
    }
}