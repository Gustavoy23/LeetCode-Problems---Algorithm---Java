class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack();
        int n = s.length();
        int i =0;
        int count = 0;
        for(char c: s.toCharArray()) {
            if(c == '(') count++;
        }
       
        String res = "";
        while(count > 0){
            StringBuilder sb = new StringBuilder();
            int j = 0;
            i = 0;
            boolean flag = false;
            while(i < s.length()) {
                char c = s.charAt(i);
                
                if(c == '(' && j == count-1 && !flag) {
                    Stack<Character> temp = new Stack();
                    i++;
                     
                    while(s.charAt(i) != ')'){
                        temp.push(s.charAt(i));
                       
                        i++;
                    }
                      
                    while(!temp.isEmpty()) {
                       // System.out.println(sb.toString());
                        sb.append(temp.pop());
                    }
                  
                    flag = true;
                    count--;
                    i++;
                    continue;
                } else if(c == '(' && j < count-1) {
                   
                     sb.append(c);
                     j++;
                } else {
                    sb.append(c);   
                }
            i++;
            
            }
          s = sb.toString();   
        }
    return s;
    }
}