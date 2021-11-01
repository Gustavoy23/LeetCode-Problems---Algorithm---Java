class Solution {
  
    char[][] temp;
    public void solve(char[][] board) {
        
        int m = board.length;
        int n = board[0].length;
        
        for(int i = 1; i <m-1;i++){
            for(int j = 1; j < n-1;j++) {
                if(board[i][j] == 'X') continue;
                        temp = copyBoard(board);
                        if(dfs(i, j)) {
                            
                            for(int i1 = 0; i1 <m;i1++){
                                for(int j1 = 0; j1 < n;j1++) {
                                 board[i1][j1] = temp[i1][j1];
                                }
                            }
                            
                        }
                }
            }
    
    
System.out.print(Arrays.deepToString(board));
    return;
    }
    
    private boolean dfs(int i, int j) {
        if(i == 0 || j == 0 || j == temp[0].length-1 || i== temp.length-1){
             if(temp[i][j] == 'O') return false;
             else return true;
        }
        
       if(temp[i][j] == 'X') return true;
        
        temp[i][j] = 'X'; 
        boolean l1= dfs(i+1,j);
        boolean l2 = dfs(i-1,j);
        boolean l3  = dfs(i,j+1);
        boolean l4 = dfs(i,j-1);
      //  temp[i][j] = 'O';
        
        return l1 && l2 && l3 && l4;
    }

    private char[][] copyBoard(char[][] board1){
        int m = board1.length;
        int n = board1[0].length;
        
        char res[][] = new char[m][n];
        
        for(int i = 0; i <m;i++){
            for(int j = 0; j < n;j++) {
             res[i][j] = board1[i][j];
            }
        }
    return res;
    }
}