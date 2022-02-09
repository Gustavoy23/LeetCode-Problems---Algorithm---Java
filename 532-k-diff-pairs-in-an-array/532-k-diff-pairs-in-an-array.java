class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num: nums) map.put(num, map.getOrDefault(num,0)+1);
        int pairs = 0;
        for(int x: map.keySet()) {
            if((k>0 && map.containsKey(x+k)) || (k==0 && map.get(x) > 1)) pairs++;
        }
    return pairs;
    }
}