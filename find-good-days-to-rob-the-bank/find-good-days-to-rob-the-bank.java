class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
                
        int n = security.length;
        
        //if(security.length < time) return new ArrayList<>();
        
        int[] pre = new int[n];
        int nonIncrease = 1;
        if(time==0) pre[0]=1;
        for(int i = 1; i < n; i++) {
            if(security[i] <= security[i-1]) {
                nonIncrease++;
            } else {
                nonIncrease = 1;
            }
            
            if(nonIncrease > time){
                pre[i] = 1;
            }
        }
         
        
        int[] post = new int[n];
        if(time==0) post[n-1]=1;
        nonIncrease = 1;
        for(int i = n - 2; i >= 0; i--) {
            if(security[i] <= security[i+1]) {
                nonIncrease++;
            } else {
                nonIncrease = 1;
            }
            
            if(nonIncrease > time){
                post[i] = 1;
            }
        }
        
        List<Integer> res = new ArrayList<>();
        
        for(int i= time;i < n-time;i++){
            if(pre[i] == 1 && post[i] == 1) res.add(i);
            
        }
        
    return res;
    }
}