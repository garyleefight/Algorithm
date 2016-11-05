public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack();
        int sum=0;
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            switch(s){
                case "+":
                    
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "*":
                    stack.push( stack.pop()*stack.pop());
                    break;
                case "/":
                    Integer i1=stack.pop();
                    Integer i2=stack.pop();
                    stack.push(i2/i1);
                    break;
                case "-":
                    Integer i3=stack.pop();
                    Integer i4=stack.pop();
                    stack.push(i4-i3);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}