public class Solution {
    public List<String> generateParenthesis(int n) {
        int rem_left = n;
        int rem_right = n;
        return rec(n,n);
    }
    
    private List<String> rec(int rem_left,int rem_right){
        List<String> res = new ArrayList();
        // tricky
        if(rem_left == 0 && rem_right == 1){
            res.add(")");
            return res;
        }
        
        if(rem_left>0){
            
        if(rem_right>rem_left){
            List<String> add_left = rec(rem_left-1,rem_right);
            List<String> add_right = rec(rem_left,rem_right-1);
            
            for(int i=0;i<add_left.size();i++){
                res.add("("+add_left.get(i));
            }
            
            for(int i=0;i<add_right.size();i++){
                res.add(")"+add_right.get(i));
            }
        }else{
            List<String> add_left = rec(rem_left-1,rem_right);
            
            for(int i=0;i<add_left.size();i++){
                res.add("("+add_left.get(i));
            }
        }
            
        }else{
             List<String> add_right = rec(rem_left,rem_right-1);
              for(int i=0;i<add_right.size();i++){
                res.add(")"+add_right.get(i));
            }
        }
        
        return res;
    }
}