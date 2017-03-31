public class Solution {
    public int numTrees(int n) {
        if(n == 0) return 0;
        int [] num = new int[n+1];
        num[0] = 1;
        num[1] = 1;
        for(int i=2;i<=n;i++){
            int sum = 0;
            for(int j=1;j<=i;j++){
                int num_min = j-1;
                int num_max = i-j;
                sum += num[num_min]*num[num_max];
            }
            num[i] = sum;
        }
        return num[n];
    }
}