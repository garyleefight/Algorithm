public class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if(numRows<=0) return res;

        for(int i=1;i<=numRows;i++){
            if(i == 1){
                List<Integer> new_a = new ArrayList<>();
                new_a.add(1);
                temp = new_a;
                res.add(new_a);
            }else{
                List<Integer> new_a = new ArrayList<>();
                int pre = 0;
                for(int j=0;j<=temp.size();j++){
                    if(j == 0) {
                        new_a.add(1);
                        pre = 1;}
                    else if(j == temp.size()) new_a.add(1);
                    else {
                        int now = temp.get(j);
                        new_a.add(pre + now);
                        pre = now;
                    }
                }
                temp = new_a;
                res.add(new_a);
            }
        }
        return res;
    } 
}