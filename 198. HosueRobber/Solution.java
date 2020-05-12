class Solution {
    public int rob(int[] nums) {
        // if(nums.length==0) return 0;
        // int[] dp = new int[nums.length];
        // for(int i = 0;i<nums.length;i++){
        //     dp[i] = nums[i];
        // }
        // int max = 0;
        // for(int i = nums.length-1;i>=2;i--){
        //     for(int j = i-2;j>=0;j--){
        //         dp[j] = Math.max(dp[i]+nums[j],dp[i-2]);
        //         max = Math.max(max,dp[j]);
        //     }
        // }
        // return max;
        if(nums.length==0) return 0;
        int[] dp = new int[nums.length];
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            dp[i] = nums[i];
            max = Math.max(max,dp[i]);
        }
        
        for(int i = nums.length-1;i>=2;i--){
            for(int j = i-2;j>=0;j--){
                dp[j] = Math.max(dp[i]+nums[j],dp[i-2]);
                max = Math.max(max,dp[j]);
            }
        }
        return max;
    }
}