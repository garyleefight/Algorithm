public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList();
        List<Integer> input = new ArrayList();
        if(candidates == null || candidates.length==0){
            return res;
        }

        Arrays.sort(candidates);
        dfs(candidates,target,0,res,input);
        return res;
    }

    private void dfs(int[] candidates,int target,int start,List<List<Integer>> res,List<Integer> input){
        if(target<0){
            input.remove(input.size()-1);
            return;
        }

        if(target == 0 ){
            List<Integer> list = new ArrayList();
            list.addAll(input);
            res.add(list);
            input.remove(input.size()-1);
            return;
        }

        for(int i=start;i<candidates.length;i++){
            
            input.add(candidates[i]);
            dfs(candidates,target-candidates[i],i+1,res,input);
            
            while(i<candidates.length-1 && candidates[i]==candidates[i+1]){
                i++;
            }
        }
        
        if(input.size()>0){
        input.remove(input.size()-1);}
    }
}