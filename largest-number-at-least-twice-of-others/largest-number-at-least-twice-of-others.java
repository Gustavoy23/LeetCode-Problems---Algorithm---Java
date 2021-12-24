class Solution {
    public int dominantIndex(int[] nums) {
        
        int n = nums.length;
        
        if(nums.length == 1) return 0;
        
        int largest = -1;
        int index = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] >= largest) {
                largest = nums[i];
                index = i;
            }
        }
        
        boolean flag = true;
        int i = 0;
        for(int num: nums) {
            if(i != index && num*2 > largest) {
                flag = false;
            }
            i++;
        }
    
    return flag? index: -1;
    }
}