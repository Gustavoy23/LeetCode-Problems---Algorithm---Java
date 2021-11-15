class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int LDSsize = 1;
        
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[i] % nums[j] == 0){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    LDSsize = Math.max(LDSsize, dp[i]);    
                }
                
            }
        }
        
        LinkedList<Integer> list = new LinkedList<>();
        int prev = -1;
        for(int i = dp.length - 1; i >=0; i--) {
            if(dp[i] == LDSsize && (prev == -1 || prev % nums[i] == 0)){
                list.addFirst(nums[i]);
                LDSsize--;
                prev = nums[i];
            }    
        }
    return list;
    }
}