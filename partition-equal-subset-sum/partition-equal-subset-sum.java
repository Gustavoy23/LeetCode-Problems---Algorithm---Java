class Solution {
    
    
    public boolean canPartition(int[] nums) {
    int n = nums.length;
        
    
        
    int sum = 0;
    for(int i: nums) sum+=i;
        
    if(sum % 2 != 0) return false;
        
    Map<String, Boolean> memo = new HashMap<>();
    return dfs(nums,0,0, memo, sum);
        
    }
    
    private boolean dfs(int[] nums, int index, int currentSum, Map<String, Boolean> memo, int sum) {
    String s = index + "-"+ currentSum;
    
    if(memo.containsKey(s)){
        return memo.get(s);
    }   
    if(currentSum > sum/2 || index >= nums.length) return false;
        
    if(currentSum == sum/2 ) return true;
    
    boolean m = dfs(nums, index+1, currentSum+nums[index], memo,sum) || dfs(nums, index+1, currentSum, memo,sum);    
    memo.put(s, m);
    return m;
    }
}