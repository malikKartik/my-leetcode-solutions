class Solution {
    public static char[] push(char[] stack,int top,char val){
        stack[++top] = val;
        return stack;
    }
    public boolean isValid(String s) {
        int top = -1;
        char[] stack = new char[s.length() + 1];
        for(int i = 0;i<s.length();i++){
            if(top>=0){
                if((-stack[top]+s.charAt(i))==1||(-stack[top]+s.charAt(i))==2){
                    top--;
                }
                else{
                    stack = push(stack,top,s.charAt(i));
                    top++;
                }
            }else{
                stack = push(stack,top,s.charAt(i));
                top++;
            }
        }
        if(top>=0){
            return false;
        }else{
            return true;
        }
    }
}