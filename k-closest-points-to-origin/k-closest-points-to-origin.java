class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> ((b[0]*b[0]) + (b[1]*b[1]) ) - (a[0]*a[0] + a[1]*a[1]));
        
        for(int[] p: points) {
            int x = p[0];
            int  y = p[1];
            pq.add(new int[]{x,y});
            
        }    
        
       
        
        while(pq.size() > k) {
            pq.poll();
            // System.out.println(Arrays.toString(c));
        }
        
        int[][] res = new int[k][2];
        int i = 0;
        while(pq.size() >  0) {
            int[] t = pq.poll();
            res[i][0] = t[0];
            res[i][1] = t[1];
            i++;
        }            
    return res;
    }
}