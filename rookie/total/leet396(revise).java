public class Solution {
    public int maxRotateFunction(int[] A) {
        int sum = 0;
        int temp_s = 0;
        if(A == null || A.length == 0) return 0;
        for(int i=0;i<A.length;i++){ 
            sum+= i*A[i];
            temp_s += A[i];
        }
        int max = sum;
        for(int i=1;i<A.length;i++){ 
            sum += temp_s - A.length*A[A.length-i];
            if(sum>max) max=sum;
        }
        return max;
    }
}