class Solution {
    public static Boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1; 
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) 
                return false;  
            i++; 
            j--; 
        } 
        return true;
    }
    public static String longestPalindrome(String s) {
        int len = s.length();
        for(len = s.length();len>0;len--){
            int start = 0;
            int end = len;
            while(end<=s.length()){
                if(isPalindrome(s.substring(start,end))){
                    return s.substring(start,end);
                }
                start++;
                end++;
            }
        }
        return "";
    }
}