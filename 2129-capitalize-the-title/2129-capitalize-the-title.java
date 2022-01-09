class Solution {
    public String capitalizeTitle(String title) {
        List<String> list = new ArrayList<>();
        
        for(String s: title.split(" ") ){
            list.add(s);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(String s: list) {
            StringBuilder temp = new StringBuilder();
            
            temp.append(s.toLowerCase());
            if(s.length() > 2) {
                char c = (s.toLowerCase()).charAt(0);
                int i = c - 'a';
                char capital = (char)(i + 'A');
                temp.setCharAt(0, capital);
            } 
          
            sb.append(temp.toString());
             sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
    return sb.toString();
    }
}