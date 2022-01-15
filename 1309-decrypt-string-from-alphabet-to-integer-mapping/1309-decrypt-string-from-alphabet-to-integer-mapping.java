class Solution {
    public String freqAlphabets(String s) {
        
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            if(i+2< s.length() && s.charAt(i+2) == '#') {
                res.append((char)((int)('a')+Integer.parseInt(s.substring(i,i+2))-1));
                //System.out.println((int)('a'));
                i+=2;
            } else {
                res.append((char)((s.charAt(i) - '0')+(int)('a')-1));
            }
        }
    return res.toString();
    }
}