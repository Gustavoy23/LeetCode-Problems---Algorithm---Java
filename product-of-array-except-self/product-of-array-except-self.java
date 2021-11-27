class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];
        
        int prod=1;
        for(int i = 0; i < n; i++) {
            left[i] = prod;
            prod = prod*nums[i];
        }
        
        prod=1;
        for(int i = n-1; i>=0; i--){
            right[i] = prod;
            prod = prod*nums[i];
        }
         
        for(int i = 0; i < n; i++){
            result[i] = right[i]*left[i];   
        }
    return result; 
    }
}