class Solution {
    public int numSquares(int n) {
        
        
    int r = (int)Math.sqrt((double)n);
    int dp[] = new int[n+1];
    int[] squares = new int[r];
    
    Arrays.fill(dp, n+1);

    for(int i = 0; i < r; i++){
        squares[i] = (int)Math.pow(i+1,2); 
        
    }
    
    dp[0] = 0;
        
    System.out.print(Arrays.toString(dp));    
    for(int i = 1; i <= n; i++) {
        
        for(int j = 0; j < squares.length; j++){
            if(squares[j] <= i) dp[i] = Math.min(dp[i], dp[i - squares[j]] + 1);
        }
        System.out.println(dp[i]);
    }
        
    return dp[n];
    }
}