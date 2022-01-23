class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[] circle = new int[2*n];
        int totalOnes = 0;
        for(int i = 0; i < n ;i++) {
            circle[i]= nums[i];
            circle[n+i] = nums[i];
            totalOnes+=nums[i];
        }
        
        int start = 0;
        int end = 0;
        int zeroCount = 0;
        int minZero = Integer.MAX_VALUE;
        for(;end < totalOnes; end++) {
            if(circle[end] == 0){
                zeroCount++;
            }
        }
        
        for(;end < circle.length; end++) {
            
            if(circle[end] == 0) {
                zeroCount++;
            }
            
            if(end - start +1 == totalOnes) {
                zeroCount = Math.min(zeroCount, minZero);
            } else if (end - start + 1 > totalOnes) {
                if(circle[start]==0){
                    zeroCount--;
                }
                
                minZero = Math.min(minZero, zeroCount);
                start++;
            }
            
          
            
        }
    return minZero;
    }
}