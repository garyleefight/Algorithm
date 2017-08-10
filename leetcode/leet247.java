public class Solution {
    public List<String> findStrobogrammatic(int n) {
        List<String> res =  new ArrayList<>();
        char[] res1 = {'0','1','6','8','9','6','8','9','1','0'};
        if(n == 0){
            return res;
        }
        if(n == 1){
            res.add(res1[0]+"");
            res.add(res1[1]+"");
            res.add(res1[3]+"");
            return res;
        }
        
        List<String> temp = findStrobogrammatic1(n - 2);
        if(temp.size() == 0){
            for(int i=1;i<res1.length/2;i++){
                res.add(res1[i] + "" + res1[res1.length - 1 - i]);
            }
        }else{
            for(int j=0;j<temp.size();j++){
                String s = temp.get(j);
                for(int i=1;i<res1.length/2;i++){
                    res.add(res1[i]+ "" + s + res1[res1.length - 1 - i]);
                }
            }
        }
        return res;
    }
    
    private List<String> findStrobogrammatic1(int n) {
        char[] res1 = {'0','1','6','8','9','6','8','9','1','0'};
        List<String> res = new ArrayList<>();
        if(n == 0){
            return res;
        }
        if(n == 1){
            res.add(res1[0]+"");
            res.add(res1[1]+"");
            res.add(res1[3]+"");
            return res;
        }
        
        List<String> temp = findStrobogrammatic1(n - 2);
        if(temp.size() == 0){
            for(int i=0;i<res1.length/2;i++){
                res.add(res1[i] + "" + res1[res1.length - 1 - i]);
            }
        }else{
            for(int j=0;j<temp.size();j++){
                String s = temp.get(j);
                for(int i=0;i<res1.length/2;i++){
                    res.add(res1[i]+ "" + s + res1[res1.length - 1 - i]);
                }
            }
        }
        return res;
    }
}

// clean version
public List<String> findStrobogrammatic(int n) {
    return helper(n, n);
}

List<String> helper(int n, int m) {
    if (n == 0) return new ArrayList<String>(Arrays.asList(""));
    if (n == 1) return new ArrayList<String>(Arrays.asList("0", "1", "8"));
    
    List<String> list = helper(n - 2, m);
    
    List<String> res = new ArrayList<String>();
    
    for (int i = 0; i < list.size(); i++) {
        String s = list.get(i);
        
        if (n != m) res.add("0" + s + "0");
        
        res.add("1" + s + "1");
        res.add("6" + s + "9");
        res.add("8" + s + "8");
        res.add("9" + s + "6");
    }
    
    return res;
}