class Solution {
    public boolean isBoomerang(int[][] points) {
        
        
        int ax = points[0][0];
        int ay = points[0][1];
        int bx = points[1][0];
        int by = points[1][1];
        int cx = points[2][0];
        int cy = points[2][1];
        
        Arrays.sort(points, ((a,b) -> a[0] - b[0] ));

        
        double ft = (double)(cx-ax)/(double)(cy-ay);
        double f1 = 0.0;
        double f2 = 0.0;
       
        if(ax == bx && ay == by || ax == cx && ay == cy || cx == bx && cy == by) return false;
        
        if(ax == bx && bx == cx) return false;
        
        if(ay == by && by == cy) return false;
        
        if(by - ay == 0){
             f2 = (double)(cx-bx)/(double)(cy-by);
          //  System.out.println(ft+" "+ f1+ "  "+f2);
         if(f2 == ft ) return false;    
        } else {
            f1 = (double)(bx-ax)/(double)(by-ay);
            System.out.println(ft+" "+ f1+ "  "+f2);
          if(f1 == ft) return false;
        }
        
        System.out.println(ft+" "+ f1+ "  "+f2);
        return true;
    }
}