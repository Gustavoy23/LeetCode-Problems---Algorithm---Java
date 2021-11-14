class Solution {
    public int removeBoxes(int[] boxes) {
        int size = boxes.length;
        
        int dp[][][] = new int[size][size][size];
        int right = size - 1;
        int left = 0;
        int streak = 0;
        
        return get(dp, boxes, left, right, streak );
        
    }
    
    private int get(int dp[][][],int[] boxes, int left, int right, int streak) {
        if(left > right) {
            return 0;
        } else if(left == right) {
            return (streak+1)*(streak+1);
        } else if(dp[left][right][streak] != 0) {
            return dp[left][right][streak];
        } else {
            int max = get(dp, boxes, left+1, right, 0) + (streak+1)*(streak+1);
            
            for(int i = left+1 ; i <= right; i++) {
                if(boxes[left] == boxes[i]) {
                max = Math.max(max, get(dp, boxes, left+1, i -1, 0) + get(dp, boxes, i, right, streak+1));
                    }
            }
        dp[left][right][streak]= max;
        return max;
        }
    }
}