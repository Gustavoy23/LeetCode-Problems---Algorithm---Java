class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        
     
        
        int[][] arr = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        
        Arrays.sort(arr, (a,b) -> b[0]-a[0]);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        
        int j = 0;
        while(j < k) {
            pq.add(new int[]{arr[j][0],arr[j][1]});
            j++;
        }
        
        int[] res = new int[k];
        int n = nums.length;
        for(int i = 0; i < k; i++) {
            int[] t = pq.poll();
            res[i] = t[0];
        }
        
        
    return res;
    }
}