class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int res = 0;
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                count+=-1;
            } else {
                count+=1;
            }
            
            if(map.containsKey(count)) {
                res = Math.max(res, i - map.get(count));
            } else {
                map.put(count, i);
            }
            
        }
    return res;
    }
}