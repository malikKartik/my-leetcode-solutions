class Solution {
    public int numSquares(int n) {
        int num = (int)Math.sqrt(n);
        int[] vals = new int[num];
        for(int i = 1;i<=num;i++){
            vals[i-1] = i*i;
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,n+1);
        dp[0] = 0;
        for(int i = 1;i<=n;i++){
            for(int j = 0;j<vals.length;j++){
                if(i>=vals[j]){
                    dp[i] = Math.min(dp[i],1+dp[i-vals[j]]);
                }
            }
            // System.out.println(dp[i]);
        }
        return dp[n]>n?-1:dp[n];
    }
}