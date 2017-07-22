public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null) return 0;
        if(triangle.size() == 1) return triangle.get(0).get(0);
        int size = triangle.size();
        int[] res = new int[size];
        for(int i = 0;i<size;i++){
            res[i] = triangle.get(size-1).get(i);
        }
        
        for(int i = size - 2;i>=0;i--){
            List<Integer> row = triangle.get(i);
            int temp_size = row.size();
            for(int j = 0; j<temp_size;j++){
                res[j] = row.get(j) + Math.min(res[j],res[j+1]);
            }
        }
        return res[0];
    }
}