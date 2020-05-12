class Solution {
    public void reverseString(char[] s) {
        helper(0,s.length-1,s);
    }
    public void helper(int start,int end,char[] s){
        if(start>end){
            return;
        }
        helper(start+1,end-1,s);
        char temp = s[end];
        s[end] = s[start];
        s[start] = temp;
    }
}