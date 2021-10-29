class Solution {
    int[] nums;
    Map<Integer, Integer> map;
    
    int n;
    public Solution(int[] nums) {
        map = new HashMap<>();
        this.nums = nums;
        this.n = nums.length;
        for(int i: nums) map.put(i, map.getOrDefault(i,0)+1);
    }
    
    public int pick(int target) {
        
        
        
        Map<Integer, Integer> map2 = new HashMap<>();
        int s = map.get(target);
        
        int[] temp = new int[n];
        int index = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(target == nums[i]) map2.put(index++,i);        
        }
        
        
        Random rand = new Random();
        
        int r = rand.nextInt(s);     

        return map2.get(r);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */