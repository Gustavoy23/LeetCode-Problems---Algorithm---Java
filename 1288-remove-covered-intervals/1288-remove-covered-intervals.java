class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
               Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b){
                if(a[0]> b[0]){
                    return 1;
                    
                } else {
                    return -1;
                    
                }
                
                
            }
        });
        int count = 0;
        int start = 0;
        int end = 1;
        int n = intervals.length;
        
        while(start < n && end < n) {
            if(start == end) {
                end++;
                continue;
            }
            
            if(intervals[end][0] >= intervals[start][0] && intervals[end][1] <= intervals[start][1]) {
                count++;
                end++;
                continue;
            } else if(intervals[start][0] <= intervals[end][0]) {
                start++;
            } else if(intervals[start][1] >= intervals[end][1]) {
                end++; 
            } 
        }
    return n-count ;
    }
}