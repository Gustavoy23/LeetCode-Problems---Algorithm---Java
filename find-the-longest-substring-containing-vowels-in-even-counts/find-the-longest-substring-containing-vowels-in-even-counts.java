class Solution {

    public int findTheLongestSubstring(String s) {
        
        HashMap<Character, Integer> mapLetter = new HashMap();
        mapLetter.put('a',1);
        mapLetter.put('e',2);
        mapLetter.put('i',4);
        mapLetter.put('o',8);
        mapLetter.put('u',16);
        
        int longest = 0;
        int res = 0;
        int initial = 0;
        int[] seem  = new int[32];
        Arrays.fill(seem, -1);
        for(int i = 0; i< s.length(); i++) {
           char c = s.charAt(i);
            
           if(mapLetter.containsKey(c)) res = res ^ mapLetter.get(c);
           
           if(res!=0 && seem[res] ==-1){
                
                seem[res] = i;  
          } 
            
            longest = Math.max(longest, i - seem[res]); 
        }
    return longest;
    }
}