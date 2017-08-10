public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        dfs(res,input,k,n,1);
        return res;
    }
    
    private void dfs(List<List<Integer>> res, List<Integer> input, int k, int n, int index){
        if(k == 0 && n == 0){
            List<Integer> temp = new ArrayList(input);
            res.add(temp);
            return;
        }
        
        if(k == 0) return;
        if(n < 0) return;
        
        for(int i=index; i<=9;i++){
            input.add(i);
            dfs(res,input,k-1,n-i,i+1);
            input.remove(input.size()-1);
        }
        
    }
}