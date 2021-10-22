class Solution {
    
    int[] res;
    boolean flag;
    public int[] missingRolls(int[] rolls, int mean, int n) {
        flag = false;
        int m = rolls.length;
        res = new int[n];
        int sum = 0;
        for(int i = 0; i < m; i++) sum += rolls[i];
        

        int rem = mean*(m + n) - sum;
        int minV = rem/n;
        int f = rem % n;
        if(rem > 6*n || rem < n) return new int[]{};
        
        int currAvg = sum/m;
        int count = n;
        for(int i = 0; i < n; i++) {
            if(rem <= 6 && i == n-1) {
                res[i] = rem;
                rem = 0;
            } else {
               if(minV <= 6){
                  res[i] = minV;      
               } else {
                    if(currAvg < mean) {
                        if(minV <=6) res[i] = currAvg+1;    
                    } else if(currAvg == mean) {
                        res[i] = mean;
                    } else {
                        res[i] = currAvg - 1;
                    }
               }  
                
            }
        rem-=res[i];
        sum+=res[i];   
        count--;
        if(count == 0) break;
        minV=(rem)/(count);   
        currAvg = sum/(m+i+1);
            
       // System.out.println(currAvg+" - "+ minV + " "+ sum+ " "+ rem);
            
        if(sum %(m+i+1) == 0 && currAvg == mean) {
            i=i+1;
            while(i < n) {
                res[i] = mean;
            i++;
            }
        }
            
        }
        System.out.println();
    return res;
    }
    
    
    
    
   
}