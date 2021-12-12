
class Solution {
int mod = 1000000007;
    public int numTilings(int n) {
        int[] dp = new int[n+1];
        
        if(n == 1) return 1;
        else if(n == 2) return 2;
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        
        for(int i = 4; i <=n; i++) {
            dp[i] = (2*dp[i-1] %  mod + dp[i-3] % mod)%mod;
        }
    return dp[n];
    }
}