class Solution {
    int zeroes;
    int paths;
    int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
    public int uniquePathsIII(int[][] grid) {
        int sx=0;
        int sy =0;
        paths = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1 ){
                    sx = i;
                    sy = j;
                } else if(grid[i][j]==0){
                    zeroes++;
                }
            }
        }
    //System.out.println(zeroes);
    dfs(grid, sx, sy, 0);
    return paths;
    }
    
    public void dfs(int[][] grid, int i, int j, int count) {
        if(i<0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] < 0){
            return;
        }
        
        if(grid[i][j]==1 && count > 0) return;
        
        if(grid[i][j]==2) {
            if(count == zeroes) paths++;
            return;
        }
        
        if(grid[i][j] ==0) {
            count++;
            grid[i][j] = -2;
        }
        
        for(int[] d:directions) {
            dfs(grid, i + d[0], j + d[1], count);
        }
        
        if(grid[i][j] == -2) {
            count--;
            grid[i][j] = 0;
        }
        
    } 
}