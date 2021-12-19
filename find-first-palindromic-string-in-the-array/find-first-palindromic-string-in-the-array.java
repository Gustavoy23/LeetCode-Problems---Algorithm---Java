class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String word: words) {
            boolean flag = true;
            if(word.length() == 1) return word;
            for(int i = 0; i < word.length()/2; i++) {
                if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                    flag = false;
                    break;
                }
               
            }
             if(flag) return word;
        }
    return "";
    }
}