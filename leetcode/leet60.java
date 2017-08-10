public class Solution {
    public String getPermutation(int n, int k) {
        int total = 1;
        List<Integer> input = new ArrayList();
        boolean [] remain = new boolean[n];
        for(int i=0;i<n;i++){
            remain[i] = true;
        }

        for(int i=1;i<=n;i++){
            total*=i;
        }
        int divident = k-1;
        divide(input,divident,total,n,remain);
        String res = "";
        for(Integer i:input){
            res += i;
        }
        return res;
    }

    private void divide(List<Integer> input,int divident,int total,int n,boolean[] remain){
        if(n == 0) return;

        int res = divident/(total/n) + 1;
        for(int i=0;i<remain.length;i++){
            if(remain[i] == true) res--;
            if(res == 0){
                remain[i] = false;
                input.add(i+1);
                break;
            }
        }

        divide(input,divident%(total/n),total/n,n-1,remain);
    }
}