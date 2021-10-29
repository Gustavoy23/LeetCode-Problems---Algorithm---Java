class Solution {
    public int orangesRotting(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
        int res = 0;
        
        int[][] temp = new int[m][n];
        int orange = 0;
        int rotten = 0;
        for(int i=0; i<m;i++) {
            for(int j = 0; j < n; j++){
              temp[i][j] = grid[i][j];    
                if(grid[i][j] == 1 || grid[i][j]==2) orange++;
                if(grid[i][j]==2) rotten++;
            }
        }
        
        boolean end = false;
        while(!end){ 
       
        end = true;
        for(int i = 0; i <m;i++){
           for(int j = 0;j<n;j++){
               if(grid[i][j] == 2) {
                   for(int d[]: directions) {
                       int x = d[0]+ i;
                       int y = d[1] + j;
                       if(x < 0 || x>=grid.length || y<0 || y>=grid[0].length || temp[x][y] == 2  || grid[x][y] == 0) continue;
                       
                       if(grid[x][y]==1){
                          temp[x][y] =2;
                          end = false;
                           rotten++;
                       } 
                 }
               }
           }
         }
        // System.out.println(Arrays.deepToString(temp));
         for(int k=0; k<m;k++) {
           grid[k] = Arrays.copyOf(temp[k], n);    
        }   
         if(!end) res++;   
        }
        
        if(rotten < orange) return -1;
    return res;
    }
    
}