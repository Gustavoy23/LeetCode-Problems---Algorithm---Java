class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        
        
        int[] record = new int[60];
        int result = 0;
        for(int i = 0; i < time.length; i++) {
            int remaining = 60 - time[i] % 60;
            if(remaining == 60) remaining = 0;
            result+=record[remaining];
            
            record[time[i] % 60]++;
            
  
            
        }
        
    return result;
        
    }
}