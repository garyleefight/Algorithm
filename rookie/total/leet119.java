public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            if(i == 0){
                List<Integer> now = new ArrayList<>();
                now.add(1);
                pre = now;
            }else{
                List<Integer> now = new ArrayList<>();
                int pre_num = 0;
                for(int j=0;j<=pre.size();j++){
                    if(j == 0) {
                        now.add(1);
                        pre_num = 1;
                    }
                    else if(j ==  pre.size()) now.add(1);
                    else{
                        int now_num = pre.get(j);
                        now.add(now_num + pre_num);
                        pre_num = now_num;
                    }
                }
                pre = now;
            }
        }
        return pre;
    }
}