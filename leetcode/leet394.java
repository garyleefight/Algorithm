public class Solution {
    public String decodeString(String s) {
        if(s == null || s.length() == 0) return s;
        Stack<String> stack = new Stack<>();
        String temp = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ']'){
                stack.push(temp);
                String out = "";
                while(!stack.peek().equals("[")) out = stack.pop() + out;
                stack.pop();
                String num = stack.pop();
                int k = -1;
                for(int j=num.length()-1;j>=0;j--){
                    if(!checknum(num.charAt(j))){
                        k = j;
                        break;
                    }
                }
                int time;
                String pre = "";
                if(k == -1) time = Integer.parseInt(num);
                else{
                    time = Integer.parseInt(num.substring(k+1));
                    pre = num.substring(0,k+1);}
                String res = "";
                while(time > 0){
                    res += out;
                    time--;
                }
                stack.push(pre+res);
                temp = "";
            }else if(s.charAt(i) == '['){
                stack.push(temp);
                temp = "";
                stack.push("[");
            }
            else{
                temp += s.charAt(i);    
            }
        }
        if(temp.length() > 0) stack.push(temp);
        String r = "";
        while(!stack.isEmpty()) r = stack.pop() + r;
        return r;
    }
    
    private boolean checknum(char c){
        return (c - '0' >= 0 && c - '0' <= 9);
    }
    
    
}