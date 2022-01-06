class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double max = 0;
        for(int i = 0; i < n-2; i++) {
            for(int j = i +1; j < n-1; j++) {
                for(int k = j+1; k < n; k++){
                    int[] a = points[i];
                    int[] b = points[j];
                    int[] c = points[k];
                    
                    double area = Math.abs(Area(a,b) + Area(b,c) + Area(c,a));
                    max = Math.max(max, area);
                }
            }
        }
        return max;
        
    }
    
    private double Area(int[] a, int[] b) {
        double l = b[0] - a[0];
        double h = (b[1] + a[1] )/2.0;
       // System.out.println(l*h);
        return l*h;
    }
}