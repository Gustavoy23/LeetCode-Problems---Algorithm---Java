class Solution {
    public int countVowelSubstrings(String word) {
        
        Set<Character> set = new HashSet<>();
        int res = 0;
        int n = word.length();
        for(int i = 0; i < n -4; i++) {
            
            set.clear();
            for(int j = i; j < n ; j++){
                char ch = word.charAt(j);
                
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u'){
                    set.add(ch);
                    if(set.size() == 5) res++;
                } else break;
                
            }
            
        }
    return res;
    }
}