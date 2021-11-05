class Solution {
    public int arrangeCoins(int n) {
        
        int stair = 0;
        if(n == 0) return 0;
        while(n > 0) {
            
            if(n < stair) break;
            
            n -= stair;
            stair++;   
    
        }
        
        return stair-1;
        
    }
}