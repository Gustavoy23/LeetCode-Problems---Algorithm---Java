class Solution {
    public String frequencySort(String s) {
        
     Map<Character, Integer> map = new HashMap<>();
     for(char c: s.toCharArray()) map.put(c, map.getOrDefault(c,0)+1);
        
     PriorityQueue<Character> pq = new PriorityQueue<Character>((a,b) -> map.get(b) - map.get(a));
        
     pq.addAll(map.keySet());
        
    StringBuilder sb = new StringBuilder();
     while(!pq.isEmpty()) {
         char c = pq.poll();
         int f= map.get(c);
         
         while(--f >=0) sb.append(c);
     }
        
    return sb.toString();
    }
}