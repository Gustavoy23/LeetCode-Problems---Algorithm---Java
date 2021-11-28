class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        Queue<List<Integer>> q = new LinkedList<>();
        
        q.add(Arrays.asList(0));
        int goal = graph.length-1;
        
        while(!q.isEmpty()) {
            List<Integer> current = q.poll();
            
            int lastNode = current.get(current.size()-1);
            
            if(lastNode == goal) {
                result.add(new ArrayList<>(current));
            } else {
                int neighbors[] = graph[lastNode];
                
                for(int neighbor: neighbors)  {
                    List<Integer> list = new ArrayList<>(current);
                    list.add(neighbor);
                    q.add(list);
                }
            }
        }
    return result;
    }
}