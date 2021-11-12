class Solution {
    public long countVowels(String word) {
        long res = 0;
        int n = word.length();
        long i = 0;
        for(char c: word.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                long l = n -i;
                res+= (i*l) + (l);
            }
        i++;
        }
    return res;
    }
}