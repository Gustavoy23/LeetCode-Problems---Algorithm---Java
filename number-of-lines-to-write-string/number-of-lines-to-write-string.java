class Solution {
    public int[] numberOfLines(int[] widths, String s) {
    int count = 0;
    int sum = 0;
        for(int i = 0; i < s.length(); i++) {
           sum+= widths[s.charAt(i) - 'a'];
            if(sum > 100) {
                sum = widths[s.charAt(i) - 'a'];
                count++;
            }
            
            
        }
    
     count++;
     return new int[]{count, sum};
    }
}