class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length == 0) return list;
        
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        
        for(int i = 0; i < n ; i++) {
            
            int j = i+1;
            int k = n - 1;
            
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    Collections.sort(temp);
                    if(!set.contains(temp)) {
                        list.add(temp);
                    }
                    set.add(temp);
                    j++;
                    k--;
                }else if(sum < 0) {
                    j++;   
                } else {
                    k--;
                }
            }
        }
        
        return list;
    }
}