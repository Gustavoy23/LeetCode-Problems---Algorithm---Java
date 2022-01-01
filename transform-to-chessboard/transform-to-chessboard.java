class Solution {
    int[] res;
    public int movesToChessboard(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        
        int onesFirstRow = 0;
        int onesFirstCol = 0;
        int movesRowNeed = 0;
        int movesColNeed = 0;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n;j++) {
                if(((board[0][0]^board[i][0]^board[i][j]^board[0][j])) == 1) return -1;
            }
        }
        
        for(int i = 0; i < m; i++) {
            onesFirstRow+=board[0][i];
            onesFirstCol+=board[i][0];
            
            if(board[i][0] == i % 2) movesRowNeed++;
            
            if(board[0][i] == i % 2) movesColNeed++; 
        }
        
        if(onesFirstRow < n/2 || onesFirstRow > (n+1)/2) return -1;
        
        if(onesFirstCol < n/2 || onesFirstCol > (n +1)/2 ) return -1;
        
        if(n % 2 == 1) {
            if(movesRowNeed % 2 == 1) movesRowNeed = n - movesRowNeed;
            if(movesColNeed % 2 == 1) movesColNeed = n - movesColNeed;
        } else {
            movesRowNeed = Math.min(movesRowNeed, n - movesRowNeed);
            movesColNeed = Math.min(movesColNeed, n - movesColNeed);
        }
    
    return (movesRowNeed + movesColNeed)/2;
    }
}