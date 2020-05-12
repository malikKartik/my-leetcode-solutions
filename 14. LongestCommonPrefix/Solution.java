class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        int index;
        String commstr = "";
        if(strs.length == 0) return "";
        for(int i = 0;i<strs.length;i++){
            if(strs[i].length()<min){
                min = strs[i].length();
            }
        }
        commstr = strs[0].substring(0,min);
        for(int i = 1;i<strs.length;i++){
            if(strs[i].substring(0,commstr.length())==commstr){
                continue;
            }
            else{
                String commstrtemp = "";
                for(int j = 0;j<min;j++){
                    if(strs[0].charAt(j)==strs[i].charAt(j)){
                        commstrtemp = commstrtemp + strs[0].charAt(j);
                    }else{
                        break;
                    }
                }
                if(commstrtemp.length() < commstr.length()){
                    commstr = commstrtemp;
                    if(commstr == ""){
                        return "";
                    }
                }
            }
        }
        return commstr;
    }
}