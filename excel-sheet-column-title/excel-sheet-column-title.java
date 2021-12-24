class Solution {
    public String convertToTitle(int columnNumber) {
        
        int n = columnNumber;
        if(n == 1) return "A";
        StringBuilder sb = new StringBuilder();
        while(n>0) {
            int c = n % 26;
            if(c!=0) sb.insert(0,(char)(c + 'A'-1));
            else {
                sb.insert(0,'Z');
                n--;
            }
            n = n/26;
        }
        
        return sb.toString();
        
    }
}