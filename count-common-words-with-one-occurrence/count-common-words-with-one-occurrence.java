class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Set<String> set = new HashSet<>();
        
        for(String word: words1) {
            map1.put(word, map1.getOrDefault(word,0)+1);
            set.add(word);    
        }
        
        
        for(String word: words2) {
            map2.put(word, map2.getOrDefault(word,0)+1);
            
        }
        
        for(String word: set) {
            if(map1.containsKey(word) && map1.get(word)== 1 && map2.containsKey(word) && map2.get(word) ==1) {
              // System.out.println(word);
                count++;
            }
        }
    return count;
    }
}