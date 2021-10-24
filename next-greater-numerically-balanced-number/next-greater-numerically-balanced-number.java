class Solution {
    public int nextBeautifulNumber(int n) {
        
        boolean balanced = false;
        
        int res = n;
        while(!balanced) {
            balanced = true;
            res++;
            int n0 = res;
            int copy = res;
            Map<Integer, Integer> map = new HashMap<>();
             while(n0 > 0) {
                 int digit = n0 % 10;
                 n0 = n0 / 10;
                 map.put(digit, map.getOrDefault(digit,0) + 1);
            }
            
            while(copy > 0) {
                 int digit = copy % 10;
                 copy = copy / 10;
                 if( !map.containsKey(digit) || digit != map.get(digit)) {
                     balanced = false;
                     break;
                 }
            }
            
        }
    return res;
    }
}