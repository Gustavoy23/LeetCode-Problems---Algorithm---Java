class Solution {
    public int maximumDetonation(int[][] bombs) {
        
        Map<Integer, List<Integer>> graph = buildGraph(bombs);
        int memo[] = new int[bombs.length];
        int maxBombs = 0;
        for(int i = 0; i < bombs.length; i++) {
            Set<Integer> visited = new HashSet<>();
            int bomb = bfs(graph, i, visited);
            maxBombs = Math.max(maxBombs, bomb);   
        }
        
    return maxBombs;
    }
    
    private int bfs(Map<Integer, List<Integer>> graph,int i, Set<Integer> visited) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visited.add(i);
        
        while(!q.isEmpty()) {
            
            int current = q.poll();
            
            for(int neigh: graph.get(current)) {
                if(!visited.contains(neigh)) {
                    q.add(neigh);
                    visited.add(neigh);
                }
            }
        }
        return visited.size();
    }
    
    private Map<Integer, List<Integer>> buildGraph(int[][] bombs) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < bombs.length; i++) {
            long x1 = bombs[i][0];
            long y1 = bombs[i][1];
            long r = bombs[i][2];
            
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < bombs.length ;j++) {
                long x2 = bombs[j][0];
                long y2 = bombs[j][1];
                
                if(i!=j) {
                    
                    if((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) <= (r)*(r)) list.add(j);
                }
            }
           map.put(i, list); 
        }
        
        return map;
    }
}