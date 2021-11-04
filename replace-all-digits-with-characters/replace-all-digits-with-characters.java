class Solution {
    public String replaceDigits(String s) {
        
        char[] c = s.toCharArray();
        char[] alfa = new char[26];
        
        int index = 0;
        for(char ch ='a'; ch <='z'; ch++) alfa[index++] = ch;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < s.length(); i=i+2) {
            int temp = (c[i-1] - 'a') ;
           // System.out.println(c[i-1]+" "+ temp+" "+c[i]+temp);
            int t = c[i]- '0'+temp;
            c[i] = alfa[t];
            sb.append(c[i-1]);
            sb.append(c[i]);
        }
        
        if(!Character.isDigit(s.charAt(s.length()-1))) sb.append(s.charAt(s.length()-1)); 
        
        return sb.toString();
    }
}