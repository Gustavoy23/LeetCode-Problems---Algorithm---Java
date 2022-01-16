class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        int n = (s.length())/k;
        
        int rem = (((s.length())) % k);
        String res[];
        if(rem ==0){
            res = new String[n];
        } else {
            res = new String[n+1];
        }
        
        int j =0;
        for(int i = 0; i < n; i++) {
            int f = j+k;
            res[i] ="";
            while(j<f){
                res[i] += s.charAt(j);
                j++;
            } 
        }
        
        if(rem != 0 ){
            int f = j+k;
            res[n]="";
            while(j < f) {
                if(j < s.length()) res[n] += s.charAt(j);
                else res[n] += fill;
                j++;
            }
        }
        
    return res;    
    }
}