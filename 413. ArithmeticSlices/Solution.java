class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length <= 2) return 0;
        int start = 0;
        int end = start + 2;
        int[] dp = new int[A.length];
        int sum = 0;
        for(int i = 2;i<A.length;i++){
            if(A[start]-A[start+1] == A[start+1] - A[end]){
                sum++;
                dp[i] = sum;
                start++;
                end++;
            }else{
                sum = 0;
                dp[i] = sum;
                start++;
                end++;
            }
        }
        sum = 0;
        for(int i = 0;i<A.length;i++){
            sum += dp[i];
        }
        return sum;
    }
}