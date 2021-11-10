class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            
            min = Math.min(min, prices[i-1]);
            if(prices[i] > prices[i-1]) {
                profit+= prices[i] - min;
                min = Integer.MAX_VALUE;
            }
            
            
        }
    return profit;
    }
}