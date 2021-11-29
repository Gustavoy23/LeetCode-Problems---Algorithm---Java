class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for(int i = n - 1; i >=0; i-- ){
            if(nums[i]==target) res.add(i);
            
        }
        
        Collections.sort(res);
        return res;
    }
}
//[1,2,2,3,5]
           
               