class Solution {
    public int maxProfit(int[] prices) {

    if(prices.length < 2) return 0; 
    int n = prices.length;
        
    int leftMin = prices[0];
    int left[] = new int[n];    
    left[0] = 0; 
        
    for(int i=1; i < n; i++){
        left[i] = Math.max(left[i-1], prices[i] - leftMin);
        leftMin = Math.min(leftMin, prices[i]);
    }
        
    int rightMax =  prices[n-1];
    int right[] = new int[n];
  
    for(int i=n-2; i >=0; i--){
        right[i] = Math.max(right[i+1], rightMax - prices[i]);
        rightMax = Math.max(rightMax, prices[i]);
    }
        
    int res = 0;
    for(int i = 0; i < n; i++) {
        res = Math.max(res, right[i]+left[i]);
    }
        
    return res;
    }
}