class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return 0;
        int dp[][] = new int[matrix.length][matrix[0].length];
        int max = 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(j == 0 || i==0){
                    dp[i][j] = matrix[i][j]-'0';
                    
                }
                else{
                    int temp = Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                    // System.out.println("temp--> "+temp);
                    dp[i][j] = (temp+1)*(matrix[i][j]-'0');
                }
                max = Math.max(dp[i][j],max);
            }
        }
        return max*max;
    }
}