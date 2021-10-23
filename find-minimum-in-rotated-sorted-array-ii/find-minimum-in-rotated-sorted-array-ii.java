class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        
        while(low < high) {
            int mid = low +(high-low)/2;
            
            if(nums[high] == nums[mid]) {
                high = high -1;
            } else if(nums[high] > nums[mid]) {
                high = mid ;
            } else {
                low = mid + 1;
            }
        }
    return nums[low];
    }
}