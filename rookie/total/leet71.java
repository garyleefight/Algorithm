public class Solution {
    public String simplifyPath(String path) {
        String[] res = path.split("[/]+");
        Stack stack = new Stack();
        for(int i=0;i<res.length;i++){
            if(res[i].equals(".")) continue;
            else if(res[i].equals("..")){
                if(stack.isEmpty()) continue;
                else stack.pop();
            }else if(res[i].equals("")) continue;
            else{
                stack.push(res[i]);
            }
        }
        StringBuilder s= new StringBuilder();
        if(stack.isEmpty()){
            return "/";
        }
        
        Stack another = new Stack();
        while(!stack.isEmpty()){
            another.push(stack.pop());
        }
        
        while(!another.isEmpty()){
            s.append("/"+another.pop());
        }
        return s.toString();
    }
}