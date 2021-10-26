class Solution {
    Map<String, Integer> memo;
    public int countHighestScoreNodes(int[] parents) {
        
        memo = new HashMap<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < parents.length; i++) {
            if(parents[i] != -1) {
               
                map.putIfAbsent(i, new ArrayList<>());
                List<Integer> temp = map.get(i);
                temp.add(parents[i]);
                map.put(i,temp);
               
                map.putIfAbsent(parents[i], new ArrayList<>());
                temp = map.get(parents[i]);
                temp.add(i);
                map.put(parents[i],temp);
            }
        }
        
        Map<Long, Integer> scoreMap = new HashMap<>();
        
        long max = -1;
        for(int i = 0; i < parents.length; i++){
            long score = 1;
                 Set<Integer> set = new HashSet<>();
                 set.add(i);
            int sum = 0;
            List<Integer> g = map.get(i);
            for(int j = 0; j < g.size()-1;j++){
                
                int v = g.get(j);
                //System.out.println(i + " "+v);
                
                int t = dfs(map, v, set);
                sum+=t;
                 // System.out.println(dfs(map, v, set));
                score *= t;
                
            }
           // System.out.println();
            if(g.size()>1) score*=(parents.length-1-sum);
            else score = parents.length-1;
            
          
         max = Math.max(score, max);
              scoreMap.put(score, scoreMap.getOrDefault(score, 0) +1 );       
          }
        System.out.println();
    

    return scoreMap.get(max);
    }
                        
    private int dfs(Map<Integer, List<Integer>> map, int node, Set<Integer> visited){
       
       int res = 0;
        
        visited.add(node);
        for(int neighbor: map.get(node)) {
            
            if(!visited.contains(neighbor)){
              if(memo.containsKey(node+"-"+neighbor)) {
                    res+= memo.get(node+"-"+neighbor);
                } else {
                    int y =dfs(map, neighbor, visited);
                    memo.put(node+"-"+neighbor, y);
                    res+=y;
                } 
            }
        }
    
    return res+1;
    }
        
}