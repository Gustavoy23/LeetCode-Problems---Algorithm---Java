class Solution {
    public int numberOfBeams(String[] bank) {
        
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int index = 0;
        for(String row: bank) {
            int count = 0;
            for(char c: row.toCharArray()) {
                if(c == '1') {
                    count++;
                }
                map.put(index, count);
            }
        index++;
        
        }
        
        int prev = 0;
        int res = 0;
        for(int i = 0; i < bank.length; i++)  {
            if(map.get(i) > 0) {
                res += map.get(i) * prev;
                prev = map.get(i);
            }
        }
    return res;
    }
}