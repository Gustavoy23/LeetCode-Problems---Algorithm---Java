class Solution {
    public int longestPalindromeSubseq(String s) {
        
    int n = s.length();
    int[][] dp = new int[n][n];
    for(int i = 0; i < n; i++){
        dp[i][i] = 1;
    }
        //. b b b a b 
        //  1 2 3 3 4
        //    1 2 2 3 
        //      1 1 3    
        //        1 2  
        //          1
        //////////////
        
    for(int l=2;l < n+1; l++) {
        for(int i = 0; i < n-l+1; i++) {
            int j = i + l - 1;
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            
            if(c1 == c2 && l==2){
                dp[i][j] = 2;
            } else if(c1 == c2) {
                dp[i][j] = dp[i+1][j-1]+2;
            } else {
                dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
            }
        }
    }
    
    return dp[0][n-1];
    }
}