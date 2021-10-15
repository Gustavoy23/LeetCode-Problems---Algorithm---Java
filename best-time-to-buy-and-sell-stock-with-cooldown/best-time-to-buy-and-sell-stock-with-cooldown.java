class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length;
        
        if(n < 2) return 0;
        
        int[] buy = new int[n];
        int[] profit = new int[n];
        
        buy[0] = 0-prices[0];
        profit[0] = 0;
        
        buy[1] = 0 -Math.min(prices[0], prices[1]);
        profit[1] = Math.max(0,buy[0]+ prices[1]);
        
        for(int i = 2; i <n; i++){
            buy[i] = Math.max(buy[i - 1], profit[i-2] - prices[i] );
            profit[i] = Math.max(profit[i - 1], buy[i-1] + prices[i]);
        }
        
    return profit[n-1];
    }
}