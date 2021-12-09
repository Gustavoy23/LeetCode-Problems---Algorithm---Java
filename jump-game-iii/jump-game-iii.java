class Solution {
    
    boolean[] memo;
    public boolean canReach(int[] arr, int start) {
        memo = new boolean[arr.length];
        return dfs(arr, start);
        
    }
    
    private boolean dfs(int[] arr, int index) {
        if(index < 0 || index >= arr.length || memo[index]==true) return false;
        if(arr[index] == 0) return true;
        
        
        
        memo[index] = true;
            
        
        return dfs(arr, index+arr[index]) || dfs(arr, index-arr[index]);
        
    } 
}