class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if (n == 0)
            return matrix;
        int r1 = 0, r2 = n - 1;
        int c1 = 0, c2 = n - 1;
        int i = 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++){
                matrix[r1][c] = i;
                i++;
            }
            for (int r = r1 + 1; r <= r2; r++){
                matrix[r][c2] = i;
                i++;
            }
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--){
                    matrix[r2][c] = i;
                    i++;
                }
                for (int r = r2; r > r1; r--){
                    matrix[r][c1] = i;
                    i++;
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return matrix;
    }
}