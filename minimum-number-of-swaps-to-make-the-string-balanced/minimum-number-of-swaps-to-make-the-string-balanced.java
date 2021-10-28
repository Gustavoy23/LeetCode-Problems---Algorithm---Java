class Solution {
    public int minSwaps(String s) {
        
        Stack<Character> stack = new Stack();
        
        for(char c: s.toCharArray() ){
            if(stack.isEmpty()){
                stack.push(c);
            } else {
                if(c == ']') {
                    if(stack.peek() == '['){
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else {
                    stack.push(c);
                }
                    
                    
            }
                
        }
        
        
        return  stack.size()/4 + (stack.size() % 4 == 0 ? 0:1);
        
    }
}