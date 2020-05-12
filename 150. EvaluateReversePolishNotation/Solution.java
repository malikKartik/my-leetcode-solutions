class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(int i = 0;i<tokens.length;i++){
            if(tokens[i].charAt(0)!='+' && tokens[i].charAt(tokens[i].length()-1)!='-' && tokens[i].charAt(0)!='*' && tokens[i].charAt(0)!='/'){
                stack.push(tokens[i]);
            }
            // System.out.println(stack.peek());
            if(tokens[i].charAt(0)=='+'){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(b+a));
                // System.out.println("+ push" + stack.peek()); 
            }
            if(tokens[i].charAt(0)=='*'){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(b*a));
                System.out.println("* push" + stack.peek());
            }
            if(tokens[i].length() == 1 && tokens[i].charAt(0)=='-'){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(b-a));
                System.out.println("- push" + stack.peek());
            }
            if(tokens[i].charAt(0)=='/'){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(b/a));
                System.out.println("/ push" + stack.peek());
            }
        }
        return Integer.parseInt(stack.pop());
    }
}