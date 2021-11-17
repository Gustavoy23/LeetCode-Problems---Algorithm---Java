class Solution {
    long mod = 1000000007;
    public int rectangleArea(int[][] rectangles) {
        
        List<int[]> events = new ArrayList<>();
        
        for(int[] rect: rectangles) {
            events.add(new int[]{rect[0],0,rect[1],rect[3]});
            events.add(new int[]{rect[2],1,rect[1],rect[3]});
        }
        
        Collections.sort(events, (a,b) -> a[0] == b[0] ? a[1] - b[1]: a[0] - b[0]);
        
        List<int[]> tupples = new ArrayList<>();
        
        int prev = Integer.MIN_VALUE;
        long area = 0;
        
        for(int[] event: events) {
            int y1 = event[2];
            int y2 = event[3];
            int close = event[1];
            int curr = event[0];
            int diff = curr - prev;
            area+=getArea(tupples, diff);
            
            if(close == 1) {
                remove(tupples, y1, y2);
            } else {
                tupples.add(new int[] {y1, y2});       
                Collections.sort(tupples, (a,b) -> a[0] - b[0]);
            }
            prev = curr;
        }
        
    return (int) (area % mod);
    }
    
    private int getArea(List<int[]> tupples, int diff  ) {
        long area = 0;
        int prev = Integer.MIN_VALUE;
        
        for(int[] tupple: tupples) {
            int y1 = tupple[0];
            int y2 = tupple[1];
            prev = Math.max(prev, y1);
            long temp = ((long) y2 - (long) prev)* (long)diff %mod;
            area+= Math.max(0, temp);
            prev = Math.max(prev, y2);
            
        }
    return (int) (area % mod);
    }
    
    private void remove(List<int[]> tupples, int y1, int y2) {
        
        int index = 0;
        for(int[] tupple: tupples) {
            if(tupple[0] == y1 && tupple[1] == y2) {
                tupples.remove(index);
                break;
            }
            index++;
        }
        
    }
}