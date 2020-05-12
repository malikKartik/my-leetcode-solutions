class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String str = "";
        for(int i = arr.length -1;i>=0;i--){
            String temp = arr[i];
            while(temp.length()>0&&temp.charAt(0)==' '){
                temp = "";
            }
            System.out.println(temp.length());
            str = str + temp + " ";
            if(temp.length() == 0)
                str = str.substring(0,str.length()-1);
        }
        if(str.length()==0) return "";
        while(str.charAt(str.length()-1)==' '){
            str = str.substring(0,str.length()-1); 
        }
        return str;
    }
}