class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length;i++) map.put(nums[i], i);
        
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length;i++) {
         
            //System.out.println(target - nums[i]);
            
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i){
                return new int[]{i, map.get(target - nums[i])};
            }
            
        }
        
    return result;
    }
}