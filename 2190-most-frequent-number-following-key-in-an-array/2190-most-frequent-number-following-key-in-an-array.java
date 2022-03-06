class Solution {
    public int mostFrequent(int[] nums, int key) {
        int n = nums.length;
        int res = 0;
        int resi = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 1; i<n; i++) {
            if(nums[i-1] == key){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);                
                if(map.get(nums[i]) > res) {
                    res = map.get(nums[i]);
                    resi = nums[i];
                }
            } 
        }
        
        return resi;
    }
}