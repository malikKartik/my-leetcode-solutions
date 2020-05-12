class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int rowend = matrix.length -1;
        int colend = matrix[0].length -1;
        for(int  i = 0;i<matrix[0].length-1;i++){
            if(matrix[0][i] > target){
                colend = i;
                break;
            }
        }
        for(int  i = 0;i<matrix.length-1;i++){
            if(matrix[i][0] > target){
                rowend = i;
                break;
            }
        }
        
        for(int i = 0;i<=rowend;i++){
            for(int j = 0;j<=colend;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}