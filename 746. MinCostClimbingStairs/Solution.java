class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[cost.length-1] = cost[cost.length-1];
        dp[cost.length-2] = cost[cost.length-2];
        for(int i = cost.length-1;i>0;i--){
            dp[i-1] = Math.min(dp[i-1],cost[i-1]+dp[i]);
            if(i>1){
                dp[i-2] = Math.min(dp[i-2],cost[i-2]+dp[i]);
            }else{
                dp[i-1] = Math.min(dp[i-1],dp[i]);
            }
        }
        return dp[0];
    }
}