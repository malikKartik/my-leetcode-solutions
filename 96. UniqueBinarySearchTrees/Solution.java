class Solution {
    
    public int numTrees(int n) {
        int dp[] = new int[n + 1]; 
        Arrays.fill(dp, 0); 

        // Base case 
        dp[0] = 1; 
        dp[1] = 1; 

        // fill the dp table in 
        // top-down approach. 
        for (int i = 2; i <= n; i++)  
        { 
            for (int j = 1; j <= i; j++)  
            { 

                // n-i in right * i-1 in left 
                dp[i] = dp[i] + (dp[i - j] *  
                                 dp[j - 1]); 
            } 
        } 

        return dp[n];
    }
}