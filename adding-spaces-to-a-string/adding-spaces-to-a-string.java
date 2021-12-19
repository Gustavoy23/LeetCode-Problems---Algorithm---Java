class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        StringBuilder res = new StringBuilder();
        
        Set<Integer> set = new HashSet<>();
        
        for(int space: spaces) set.add(space);
        
        for(int i = 0; i < s.length();i++) {
            if(set.contains(i)) res.append(' ');
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}