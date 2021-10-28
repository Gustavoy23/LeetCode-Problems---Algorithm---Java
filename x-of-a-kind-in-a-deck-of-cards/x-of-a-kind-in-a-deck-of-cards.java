class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        
        
        if(deck.length < 2) return false;
        Map<Integer, Integer> map = new HashMap<>();
        
        int min = Integer.MAX_VALUE;
        
        for(int i: deck) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for(int i: map.values()){
            min = Math.min(i, min);
        }
        
        for(int i=min-1; i > 1; i--) {
            boolean flag = true;
            //System.out.print(" "+"min "+i+ " map");
            for(int j: map.values()){
              //  System.out.print(" "+j+ " ");
                if(j % i != 0) {
                    flag = false;
                    break;
                }
                
                
            }
            if(flag) min = i;
        }
        
       // System.out.println(min);
        boolean res = true;
        
        if(map.size() == 1) return true;
        if(min ==1 && map.size() > 1) return false;
                
        for(int i: map.values()){
            if(i % min != 0) return false;
        }
        
    return true;
    }
}