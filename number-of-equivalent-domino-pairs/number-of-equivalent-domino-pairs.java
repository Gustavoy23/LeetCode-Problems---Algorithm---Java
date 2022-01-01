class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int[] domino: dominoes) {
            int temp[] = new int[]{domino[0], domino[1]};
            Arrays.sort(temp);
     
            map.put(Arrays.toString(temp), map.getOrDefault(Arrays.toString(temp),0)+1);
        }
        
        int res = 0;
        for(int k: map.values()){
         //   System.out.println(i);
            if(k > 1) {
                for(int i = 0; i < k-1; i++) {
                   for(int j = i+1; j < k; j++){
                        res++;
                    }
                }
            }
        }
        

        
    return res;
    }
}