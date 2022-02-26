class Solution {
    public int countTriples(int n) {
       
        if(n==0) return 0;
        
        if(n==1) return 0;
        
   
        int res = 0;
        for(int number = 0; number <= n; number++) {

            for(int a = 1; a <= number ; a++) {
                for(int b = 1; b <=number; b++) {
                    if(Math.sqrt(a*a + b*b)==number){
                        res++;
                    }
                }
            }
            
        }
    return res;
    }
}