class Solution {
    int[] count;
    int[] res;
    List<Set<Integer>> graph;
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        count = new int[n];
        res = new int[n];
        graph = new ArrayList<>();
        
        for(int i = 0; i < n; i++) graph.add(new HashSet<>());
        
        for(int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            
            graph.get(b).add(a);
            graph.get(a).add(b);
        }
        
        postorder(0, -1);
        preorder(0, -1);
        
        return res;
        
    }
    
    private void postorder(int root, int pre) {
        for(int i: graph.get(root)) {
            if(i == pre) continue;
            
            postorder(i, root);
            count[root]+=count[i];
            res[root] += res[i] + count[i];
            
        }
        count[root]++;
    }
    
    private void preorder(int root, int pre) {
        for(int i: graph.get(root)) {
            if(i == pre) continue;
           
            res[i] = res[root] - count[i] + (count.length - count[i]);
             preorder(i, root);
        }
    }
}