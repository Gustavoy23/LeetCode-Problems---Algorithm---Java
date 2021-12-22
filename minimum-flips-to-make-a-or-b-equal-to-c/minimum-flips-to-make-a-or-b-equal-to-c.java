class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while(c > 0 || b > 0 || a > 0) {
            int bitA = a & 1;
            int bitB = b & 1;
            int bitC = c & 1;
            
            if(bitA == 1 && bitB == 1 && bitC == 0) flips+=2;
            if(bitA == 0 && bitB == 0 && bitC == 1) flips++;
            if(bitA == 0 && bitB == 1 && bitC == 0) flips++;
            if(bitA == 1 && bitB == 0 && bitC == 0) flips++;
            
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
    return flips;
    }
}