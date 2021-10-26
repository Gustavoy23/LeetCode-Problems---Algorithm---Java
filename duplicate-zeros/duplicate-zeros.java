class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < arr.length; i++) {
            if(i != n - 1 && arr[i] == 0) {
                for(int j = n-1; j >= i+1; j--){
                    arr[j] = arr[j-1];
                }
            i++;
            }
        }
        
    }
}