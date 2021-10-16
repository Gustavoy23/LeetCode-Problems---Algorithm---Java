class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        
        int n = edges.length;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        
        for(int i = 1; i <= n; i++) {
            map.put(i, new HashSet<>());
        }
        
        for(int edge[]: edges) {
           System.out.println(edge[0] + " "+ edge[1]);
             if(dfs(map, edge[0], edge[1], new HashSet<>())) return edge;
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        

    return null;
    }
    
    private boolean dfs(Map<Integer, Set<Integer>> map, int src, int target, Set<Integer> visited) {
        if(src == target) return true;
        
        visited.add(src);
        
        for(int next: map.get(src)) {
            if(!visited.contains(next)){
              if(dfs(map, next, target, visited)) return true;  
            } 
        }
            
    return false;
    }
}