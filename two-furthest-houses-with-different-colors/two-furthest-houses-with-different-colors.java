class Solution {
    public int maxDistance(int[] colors) {
    int m = colors.length;
    int dist = 0;
    for(int i = 0; i < m-1; i++) {
        for(int j = i+1; j < m; j++) {
            if(colors[i]!=colors[j])dist = Math.max(dist, Math.abs(i - j));
        }
    }
    
    return dist;
    }
    
}