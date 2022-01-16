class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        
        int left[] = new int[n];
        int right[] = new int[n];
        if(seats[0]==1) {
            left[0]=0;    
        } else {
            left[0] = n-1;
        }
        
        for(int i = 1; i < n; i++) {
            if(seats[i]==1) {
                left[i] = 0;
            } else {
                left[i]= left[i-1]+1;
            }
        }
           int res = 0;
         if(seats[n-1]==1) {
            right[n-1]=0;    
        } else {
            right[n-1] = n-1;
              int dist = Math.min(right[n-1], left[n-1]);
                if(dist > res) {
                    res = dist;
                }
             
        }
        
     
         for(int i = n-2; i >= 0; i--) {
            if(seats[i]==1) {
                right[i] = 0;
            } else {
                right[i]= right[i+1]+1;
                int dist = Math.min(right[i], left[i]);
                if(dist > res) {
                    res = dist;
                }
            }
      
        }
        return res;
    }
}