class Solution {
    public int minMoves(int target, int maxDoubles) {
        
        int moves = 0;
                  
          while(maxDoubles > 0){  
            while(target > 1 && target % 2 !=0) {
                moves++;
                target--;
            }
              
            if(target % 2 ==0){
                moves++;
                target = target/2;
                maxDoubles--;
            } else break;
          }
        
          if(target!=1) moves += target-1;
         return moves;    
        
    }
}