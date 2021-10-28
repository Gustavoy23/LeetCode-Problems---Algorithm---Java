class Solution {
    public boolean isMatch(String s, String p) {
        
        char[] str = s.toCharArray();
        char[] pattern = p.toCharArray();
        
        boolean isFirst = true;
        int wIndex = 0;
        for(int i = 0; i < pattern.length; i++) {
            if(pattern[i] == '*'){
                if(isFirst) {
                    pattern[wIndex++] = pattern[i];
                    isFirst = false;
                }
            } else {
                pattern[wIndex++] = pattern[i];
                isFirst = true;
            }
        }
        
        boolean dp[][] = new boolean[s.length()+1][wIndex+1];
        
        dp[0][0] = true;
        if(wIndex > 0 &&  pattern[0] == '*') {
            dp[0][1] = true;
        }

        for(int i = 1; i < str.length+1; i++) {
            for(int j = 1; j < wIndex+1; j++){
                if(str[i-1] == pattern[j-1] || pattern[j-1] == '?') {
                    dp[i][j] = dp[i-1][j-1];
                } else if(pattern[j-1] == '*') {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }  
            }
        }
        //System.out.println(Arrays.deepToString(dp));
    return dp[str.length][wIndex];
        
    }
}