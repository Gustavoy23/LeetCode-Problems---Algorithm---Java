class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        
        int startX = startPos[1];
        int startY = startPos[0];
        int l = s.length();
        int[] res = new int[l];
        
        for(int i = 0; i < s.length(); i++) {
            int count = 0;
            int x = startX;
            int y = startY;
            for(int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                
                if(c == 'U') {
                    y--;
                } else if(c == 'D') {
                    y++;
                } else if(c == 'R') {
                    x++;
                } else if(c == 'L') {
                    x--;
                }
                
                if(x < 0 || x >= n || y < 0 || y >=n) {
                    break;
                } else {
                    count++;
                }
        
            }
        res[i] = count;
        }
    return res;
    }
}