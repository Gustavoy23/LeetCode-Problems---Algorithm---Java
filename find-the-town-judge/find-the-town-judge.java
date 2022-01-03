//Create array size n
// loop to the matriz
// index 0 - person to trus in someone
// index 1 - person to be trusted

class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] arr = new int[n];
        
        for(int[] trus: trust) {
            arr[trus[0]-1]--;
            arr[trus[1]-1]++;
        }
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == n - 1 ) return i+1;
        }
        
        return -1;
    }
}

