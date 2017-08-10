public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>(); 
        if(s.length() < 4 || s.length() > 12) return res;
        build(res,"",s,1);
        return res;
    }
    
    private void build(List<String> res,String input,String s,int count){
        if(count == 4 && check(s)){
        	res.add(input + s);
        	return;
        }

        for(int i=1;i<Math.min(4,s.length());i++){
        	String temp = s.substring(0,i);
        	if(check(temp)){
        		build(res,input + temp + ".", s.substring(i) , count+1);
        	}
        }
    }
    
    private boolean check(String s){
        if(s.charAt(0) == '0') return s.equals("0");
        int temp = Integer.parseInt(s);
        if(temp > 0 && temp <= 255) return true;
        return false;
    }
}