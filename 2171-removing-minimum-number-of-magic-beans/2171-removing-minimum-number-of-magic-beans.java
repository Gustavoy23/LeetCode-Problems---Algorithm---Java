class Solution {
    public long minimumRemoval(int[] beans) {
        
        Arrays.sort(beans);
        
        if(beans.length == 1)  return 0;
        int n = beans.length;
      
        long[] arr = new long[n];
        
        long prev = 0;
        long total = 0;
        for(int i = n-1; i >=0; i--) {
      
            total+=beans[i];
        }
        
        long res = Long.MAX_VALUE;
        
        long sum = 0;
        
        for(int i = 0; i < n-1; i++) {
       
            res = Math.min(res, total - beans[i]*(n-i-0L));
            //System.out.println(res+ " "+arr[i+1]);
            sum+=beans[i];
        }
        
        res = (long)Math.min(res, sum );
       // res = Math.min(res, beans[0] );
        
      //  [4,1,6,5]
    return res;
    }
}