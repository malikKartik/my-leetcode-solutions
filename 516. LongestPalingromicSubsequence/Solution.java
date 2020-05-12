class Solution {
    public int longestPalindromeSubseq(String s) {
        
        int dp[][] = new int[s.length()+1][s.length()+1];
        for(int i = 0;i<s.length()+1;i++){
            for(int j = 0;j<s.length()+1;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }else if(s.charAt(i-1)==s.charAt(s.length()-j)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s.length()][s.length()];
    }
}