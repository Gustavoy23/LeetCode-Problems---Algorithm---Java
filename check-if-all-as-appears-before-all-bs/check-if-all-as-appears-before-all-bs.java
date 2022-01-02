class Solution {
    public boolean checkString(String s) {
        
        Set<Character> set = new HashSet<>();
        
        boolean flag = false;
        for(char c: s.toCharArray()) {
            set.add(c);
            
            if(c == 'a' && set.contains('b')) return false;
            
        }
        
return true;

        
    }
}