public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            switch(c){
                case '(' :
                    stack.push(c);
                    break;
                case '{' :
                    stack.push(c);
                    break;
                case '[' :
                    stack.push(c);
                    break;
                case ')' :
                    if(!stack.isEmpty()){
                        if(stack.pop().equals('(')){
                            break;
                        }
                    }
                case '}' :
                    if(!stack.isEmpty()){
                        if(stack.pop().equals('{')){
                            break;
                        }
                    }
                case ']' :
                    if(!stack.isEmpty()){
                        if(stack.pop().equals('[')){
                            break;
                        }
                    }
                default :
                    return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}