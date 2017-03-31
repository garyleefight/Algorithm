public class Solution {
    public int numWays(int n, int k) {
        if(n == 0 || k == 0) return 0;
        if(n == 1) return k;
        int[][] flag = new int[n][2];
        flag[0][0] = k;
        flag[0][1] = k;
        flag[1][0] = k;
        flag[1][1] = (k-1)*k;
        for(int i=2;i<n;i++){
            flag[i][0] = flag[i-1][1];
            flag[i][1] = flag[i-1][0]*(k-1) + flag[i-1][1]*(k-1);
        }
        return flag[n-1][0] + flag[n-1][1];
    }
// inplace
     public int numWays(int n, int k) {
        if(n == 0 || k == 0) return 0;
        if(n == 1) return k;
        int change = k*(k-1);
        int n_change = k;
        int temp_change = 0;
        int temp_n_change = 0;
        for(int i=2;i<n;i++){
            temp_change = n_change*(k-1) + change*(k-1);
            temp_n_change = change;
            change = temp_change;
            n_change = temp_n_change;
        }
        return change+n_change;
    }
}