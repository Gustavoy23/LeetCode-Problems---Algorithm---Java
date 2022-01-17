class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] str = s.split(" ");
        
        int index = 0;
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        
        if(str.length!=pattern.length()) return false;
        
        for(String word: str) {
          //  if(index == pattern.length()) index = pattern.length()-1;
            char c = pattern.charAt(index);
            if(map.containsKey(c)) {
                   if(!map.get(c).equals(word)) return false;
            }
            
            if(!map.containsKey(c) && set.contains(word)) return false;
            map.put(c, word);
            set.add(word);
            index++;
        }
    return true;
    }
}