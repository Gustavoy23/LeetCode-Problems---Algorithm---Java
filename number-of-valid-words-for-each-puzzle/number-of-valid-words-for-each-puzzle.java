class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < 26; i++) map.put(i, new ArrayList<>());
        
        for(String word: words) {
            int temp = getmasking(word);
            
            for(int i = 0; i < 26; i++) {
                if((temp & (1 << i) )!= 0) map.get(i).add(temp);
            }
        }
                   
        List<Integer> res = new ArrayList<>();
        
        for(String puzzle: puzzles) {
           int puzzlemask = getmasking(puzzle);   
           int c = puzzle.charAt(0) - 'a';
           int count = 0;
            for(int mask: map.get(c) ) {
                if((mask & puzzlemask) == mask){
                    count++;
                }
            }

        res.add(count);
        }
    return res;
    }
    
    private int getmasking(String word) {
        int mask = 0;
        
        for(int i = 0;i < word.length(); i++) {
            mask = mask | getmask(word.charAt(i));
        }
        
        return mask;
    }
    
    private int getmask(char c) {
        int t = c - 'a';
        return 1 << t;
    }
}