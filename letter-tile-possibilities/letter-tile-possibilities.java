class Solution {
    int res;
    Set<String> set;
    int n;
    public int numTilePossibilities(String tiles) {
        set = new HashSet<>();
        n = tiles.length();
        res = 0;
        boolean[] visited = new boolean[n];
        dfs(tiles, new StringBuilder(), 0, visited);
        return res;
    }
    
    private void dfs(String tiles, StringBuilder sb, int index, boolean[] visited) {
        
        String str = sb.toString();
        if(index>0 && index <= tiles.length() && sb!=null && !set.contains(str)) {
            res++;
            set.add(sb.toString());
           // System.out.println(sb.toString());
        } 
        
        if(index > tiles.length()+1) return;
            
        for(int i = 0; i < n; i++) {
            char c = tiles.charAt(i);
            if(!visited[i]){
                visited[i] = true;
                sb.append(c);
                dfs(tiles, sb, index+1, visited);
                sb.deleteCharAt(sb.length() - 1);
                visited[i] = false;
            }
        }

    }
}