class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        Map<Integer,Integer> mapA = new HashMap<>();
        
        int n = nums1.length;
        
        for(int i = 0; i <n ; i++) {
            for(int j = 0; j < n; j++) {
                mapA.put(nums1[i]+nums2[j],mapA.getOrDefault(nums1[i]+nums2[j],0)+1);
            }
        }
        int res = 0;
        
          for(int i = 0; i <n ; i++) {
            for(int j = 0; j < n; j++) {
            
                if(mapA.containsKey(-1*(nums3[i]+nums4[j]))) res+=mapA.get(-1*(nums3[i]+nums4[j]));
            }
        }
        
    return res;
    }
}