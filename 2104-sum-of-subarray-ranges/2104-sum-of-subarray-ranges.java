class Solution {

    public long subArrayRanges(int[] nums) {
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=dfs(nums, i, Long.MAX_VALUE, Long.MIN_VALUE, 0);
           // System.out.println(sum);
        }
        return sum;

    }
    
    public long dfs(int[] nums, int index, long prevl, long prevh, int level) {
        long res = 0;
     
                  
        for(int i = index; i < nums.length; i++) {
           
            long highest = Math.max(nums[i], prevh);
            long lowest = Math.min(nums[i], prevl);
         
            prevh = highest;
            prevl = lowest;
            res+= highest - lowest;
        }     
        return res;
    }
}