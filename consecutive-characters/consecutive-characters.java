class Solution {
    
    
    public int maxPower(String s) {
        int res = 1;
        int curr = 1;
        for(int i = 1; i < s.length(); i++) {
            
            if(s.charAt(i)==s.charAt(i-1)) curr++;
            else curr = 1;
            
            res = Math.max(curr, res);
            
        }
    return res;
    }
}