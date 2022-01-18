class Solution {
    int res;
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        res = 0;
        for(int num: nums) {
            max = max | num; 
        }
        dfs(nums, 0, 0, max);
    return res;
    }
    
    private void dfs(int[] nums, int index, int current, int max) {
        if(current == max){
            res++;
        }
        
        for(int i = index; i < nums.length; i++) {
            int temp = current;
            current = current | nums[i];
            dfs(nums, i+1, current, max);
            current = temp;
        }
        
    }
}