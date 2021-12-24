class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        for(int i = 1; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                int val1 = Integer.MAX_VALUE, val2 = Integer.MAX_VALUE, val3 = Integer.MAX_VALUE;
                if(j - 1 >= 0) val1 = matrix[i-1][j-1]+matrix[i][j];
                val2 = matrix[i-1][j]+matrix[i][j];  
                if(j+1<matrix[0].length) val3 = matrix[i-1][j+1]+matrix[i][j];  
                matrix[i][j] = Math.min(val1, Math.min(val2,val3));
            }
        }
        
        int res = Integer.MAX_VALUE;
        int n = matrix.length;
        for(int i = 0; i < matrix[0].length; i++) {
            res = Math.min(res,matrix[n-1][i]);
        }
    return res;
    }
}