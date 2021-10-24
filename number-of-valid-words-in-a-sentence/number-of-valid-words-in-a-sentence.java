class Solution {
    public int countValidWords(String sentence) {
        int res = 0;
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(char c: sentence.toCharArray()){
            
            if(c == ' ' && sb.length() == 0) {
                continue;
            } else if(c == ' '){
                list.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }
        
        if(sb.length() != 0) list.add(sb.toString());
        
        for(String s: list) {
            
            boolean flag = true;
            int hyphen = 0;
            int pon = 0;
         //   System.out.println(s);
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c - 'A' >= 0 && c - 'A' < 26 ) {
                    flag = false;
                    break;
                }
                if(c - '0' >= 0 && c - '0' < 10 ) {
                    flag = false;
                    break;
                }
                
                if(c == '-' ){
                    if(hyphen > 0) {
                        flag = false;
                        break;
                    }
                    
                    if(!(hyphen == 0 && i > 0 && i < s.length()-1 && isLowerLetter(s.charAt(i-1)) && isLowerLetter(s.charAt(i+1)))){
                        flag = false;
                        break;
                    }
                    hyphen++;
                }
                
                if(c == '.' || c == '!' || c == ',') {
                    if(i!= s.length()-1){
                        flag = false;
                        break;
                    }
                    
                    if(pon > 0){
                        flag = false;
                        break;
                    }
                    
                    pon = 1;
                    
                }
                
            }
            if(flag) res++;
            
        }
    return res;
    }
    
    public boolean isLowerLetter(char c){
        if(c - 'a' >=0 && c - 'a'<26) return true;
        else return false;
    }
}