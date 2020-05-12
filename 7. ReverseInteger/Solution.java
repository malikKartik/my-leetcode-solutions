class Solution {
    public int reverse(int x) {
        String str = Integer.toString(x);
        int flag = 0;
        if(str.charAt(0)=='-'){
            flag = 1;
            str = str.substring(1,(str.length()));
            char ch[]=str.toCharArray();  
            String rev="";  
            for(int i=ch.length-1;i>=0;i--){  
                rev+=ch[i];  
            } 
            str =rev;
        }else{
            flag = 0;
            char ch[]=str.toCharArray();  
            String rev="";  
            for(int i=ch.length-1;i>=0;i--){  
                rev+=ch[i];  
            } 
            str =rev;
        }
        if(flag == 1){
            if(Long.parseLong(str)>2147483647){
                return 0;
            }
            else{
                return Integer.parseInt("-"+str);
            }
        }else{
            if(Long.parseLong(str)>2147483647){
                return 0;
            }
            else{
                return Integer.parseInt(str);
            }
        }
    }
}