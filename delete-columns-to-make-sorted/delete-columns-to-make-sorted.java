class Solution {
    public int minDeletionSize(String[] strs) {
        Map<Integer, Integer> map = new HashMap<>();
        
        Set<Integer> set = new HashSet<>();
        
        for(String row: strs) {
            for(int j = 0; j < row.length(); j++) {
                char c = row.charAt(j);
                if(!map.containsKey(j)) {
                    map.put(j, c - 'a');    
                } else {
                    if(map.get(j) <= c - 'a') {
                        map.put(j, c - 'a');
                    } else {
                        set.add(j);
                    }
                }
            }
        }
        
    return set.size();
    }
}