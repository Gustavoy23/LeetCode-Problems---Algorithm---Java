class Solution {
    List<String> res;
    public List<String> restoreIpAddresses(String s) {
        res = new ArrayList<>();
        dfs(s, 0, 0, new StringBuilder(),0,-1);
        return res;
    }
    
    public void dfs(String s, int value, int index, StringBuilder current, int dots, int prev) {
        if(dots == 3 && index == s.length() && current.charAt(current.length()-1)!='.' ) {
            res.add(current.substring(0,current.length()));
            return;
        }
        
        if(value > 255 || index == s.length())return;
        
        //for(int i = index; i < s.length() ; i++) {
          int i = index;
            if(value*10 + (s.charAt(i) - '0')<=255 && prev!=0){
                current.append(s.charAt(i));

                dfs(s, value*10 + (s.charAt(i) - '0'), i+1, current, dots,value*10 + (s.charAt(i) - '0'));
                current.deleteCharAt(current.length()-1);
          
            
               current.append(s.charAt(i));
           
               current.append(".");

           
               dfs(s, 0, i+1, current, dots+1,-1);
               current.deleteCharAt(current.length()-1);
               current.deleteCharAt(current.length()-1);
            }
        return;
        //}
    }
}