public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> input = new ArrayList();
        // if(k>n) return res;
        for(int i = 1; i <= n;i++){
            input.add(i);
            dfs(i+1,n,k,res,input);
            input.remove(input.size()-1);
        }
        return res;
        
    }
    
    private void dfs(int start,int n,int k,List<List<Integer>> res,List<Integer> input){
        int count = input.size();
        
        if(start + k - count -1 > n) return;
        if(count == k){
            List<Integer> temp = new ArrayList(input);
            res.add(temp);
            return;
        }
        
        
        
        for(int i = start;i <= n;i++){
            input.add(i);
            dfs(i+1,n,k,res,input);
            input.remove(input.size()-1);
        }
    }
}