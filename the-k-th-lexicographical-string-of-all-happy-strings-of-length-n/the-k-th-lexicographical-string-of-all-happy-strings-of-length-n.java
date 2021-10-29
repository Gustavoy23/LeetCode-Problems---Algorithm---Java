class Solution {
    char[] alfa = {'a','b','c'};
    List<String> list;
    public String getHappyString(int n, int k) {
        
        list = new ArrayList<>();
        dfs( n,  k, 0, new StringBuilder());
        if(k > list.size()) return "";
        return list.get(k-1);
    }
    
    private void dfs(int n, int k, int index, StringBuilder sb) {
        
        if(index == n){
            list.add(sb.toString());
            return;
        }
                                              
        for(int i = 0; i < alfa.length; i++) {
            if(sb.length() == 0 || sb.length()!= 0 && alfa[i]!=sb.charAt(sb.length()-1)  ) {
                sb.append(alfa[i]);
                dfs(n,k,index+1,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
                                              
    }
}