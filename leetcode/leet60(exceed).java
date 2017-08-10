public String getPermutation(int n, int k) {
        List<Integer> input = new ArrayList();
        String s;
        List<String> res = new ArrayList();
        dfs(n,input,res,k,0);
        return res.get(0);
    }

    private int dfs(int n,List<Integer> input,List<String> res,int k,int count){
        if(count == k){
            return count;
        }

        if(input.size() == n){
            count++;
            if(count == k){
                String s = "";
                for(int i=0;i<input.size();i++){
                    s += input.get(i);
                }
                res.add(s);
            }
            return count;
        }

        for(int i=1;i<=n;i++){
            if(!input.contains(i)){
                input.add(i);
                count = dfs(n,input,res,k,count);
                input.remove(input.size()-1);

            }
        }
        return count;

    }