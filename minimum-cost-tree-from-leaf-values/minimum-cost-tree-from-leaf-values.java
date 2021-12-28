class Solution {
    public int mctFromLeafValues(int[] a) {
        int n = a.length;
        return dfs(a, 0, n - 1, new result[n][n]).sum;
    }
    
    public result dfs(int[] a ,int left, int right, result[][] memo  ) {
        if(left > right) return new result(0, 1000000 );
        
        if(left == right) return new result(a[left], 0);
        
        if(memo[left][right] != null) return memo[left][right];
        result res = new result(0, 1000000);
        for(int i = left; i < right; i++) {
            result leftP = dfs(a, left,i,memo);
            result rightP = dfs(a, i+1, right,memo);
            int total = (leftP.max * rightP.max) + leftP.sum + rightP.sum;
            if(total < res.sum) {
                res.max= Math.max(leftP.max, rightP.max);
                res.sum = total;
                memo[left][right]=res;
            }
            
        }
    return res;
    }
    
    class result {
        int max;
        int sum;
        result(int max, int sum) {
            this.max = max;
            this.sum = sum;
        }
    }
}