class Solution {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> map = new HashMap<>();
        for(int i = 0; i < rings.length(); i=i+2){
            char position = rings.charAt(i+1);
            char color = rings.charAt(i);
            
            map.putIfAbsent(position, new HashSet<>());
            Set<Character> set = map.get(position);
            set.add(color);
            map.put(position, set);
        }
        int res =0;
        for(Set<Character> v: map.values()) {
            if(v.size()==3) res++;
        }
        return res;
    }
}