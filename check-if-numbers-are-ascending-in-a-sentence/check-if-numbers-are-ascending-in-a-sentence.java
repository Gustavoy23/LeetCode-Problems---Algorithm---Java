class Solution {
    public boolean areNumbersAscending(String s) {
        
        String words[] = s.split(" ");
        List<Integer> list = new ArrayList<>();
        
        for(String word: words) {
            
            boolean flag = true;
            
            for(char c: word.toCharArray()){
                if(!Character.isDigit(c)){
                  flag =false;
                break;
                } 
                
            }
            if(flag) list.add(Integer.parseInt(word));
        }
        
        boolean res = true;
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i)<=list.get(i-1)) return false;
        }
        
    return true;
    }
}