class Solution {
    int[] dir = {1,0,-1};
    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int dp[][][] = new int[rows][cols][cols];
        int max = 0;
        
        for(int i = 0; i < rows; i++) {
            for(int j1 = 0; j1 < cols; j1++) {
                for(int j2 = 0; j2 < cols; j2 ++) {
                    dp[i][j1][j2] = -1;
                }
            }
        }
        
        dp[0][0][cols-1] = grid[0][0] + grid[0][cols-1];
        
        for(int i = 1; i < rows; i++) {
            for(int j1 = 0; j1 < cols; j1++) {
                for(int j2 = 0; j2 < cols; j2 ++) {
                    int prev = dp[i-1][j1][j2];
                   if(prev >= 0) {
                        for(int c1: dir)    {
                            for(int c2: dir)    {
                           
                                int col1 = c1 + j1;
                                int col2 = c2 + j2;
                                
                                if(col1 >=0 && col1 < cols && col2 >=0 && col2 < cols ) {
                                    int current = col1 == col2 ? grid[i][col1]: grid[i][col1]+grid[i][col2];
                                    dp[i][col1][col2] = Math.max(dp[i][col1][col2], prev + current);
                                    max = Math.max(max, dp[i][col1][col2]);
                                }
                            
                            
                            
                        }
                    }
                   }
                    
                }
            }
        }
    return max;
    }
}