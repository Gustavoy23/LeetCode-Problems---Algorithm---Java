class Solution {
    int m;
    int n;
    public int maximalSquare(char[][] matrix) {
        
        m = matrix.length;
        n = matrix[0].length;
        int res = 0;
        for(int i = 0; i < m; i++) {
            for(int j =0; j < n; j++) {
                if(matrix[i][j] == '1') res=Math.max(res, helper(matrix, i, j));
            }
        }
        
        return res;
    }
    
    public int helper(char[][] matrix, int i0 , int j0) {
        
       int i = i0;
       int j = j0;
    int c =0;
       boolean flag = true;
       
       while(i < m && j < n) {
           
        
            if(matrix[i][j] == '0'){
                 flag = false;
                   break;
            }
          
           int t = 0;
           while(i - t >= i0 && j - t >= j0) {
               if(!flag) break;
               if(matrix[i-t][j] == '0' || matrix[i][j - t] == '0') {
                   flag = false;
                   break;
               }
               t++;
        }
           i++;
           j++;
           if(flag == false) break;
           c++;
       } 
        
     return (int)Math.pow(c,2);   
    }
}