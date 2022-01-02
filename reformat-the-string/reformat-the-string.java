class Solution {
    public String reformat(String s) {
        
        Queue<Character> letters = new LinkedList<>();
        Queue<Character> digits = new LinkedList<>();
        
        for(char c: s.toCharArray()) {
            if(Character.isDigit(c)){
                digits.offer(c);
            } else {
                letters.offer(c);    
            }
        }
        
        int metodo = 1;
        if(digits.size() - letters.size() == 1 ) {
            metodo = 1;
        } else if(digits.size() == letters.size()) {
            metodo = 1;
        } else if( letters.size() - digits.size() == 1) {
            metodo = -1;
        } else {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        while(!letters.isEmpty() || !digits.isEmpty()){
            if(metodo == 1) {
                sb.append(digits.poll());
            } else {
                sb.append(letters.poll());
            }
            metodo*=-1;
        }
    return sb.toString();
    }
}