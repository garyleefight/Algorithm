public class Solution {
    public int maxRotateFunction(int[] A) {
        int sum = 0;
        if(A == null || A.length == 0) return 0;
        for(int i=0;i<A.length;i++) sum+= i*A[i];
        int max = sum;
        for(int i=1;i<A.length;i++){ 
            for(int j=0;j<A.length;j++){
            int index = i+j;
            if(index<A.length) sum+=A[j];
            else if(index-A.length == 0) sum-=(A.length-1)*A[j];
            else sum+=A[j];
            }
            if(sum>max) max=sum;
        }
        return max;
    }
}