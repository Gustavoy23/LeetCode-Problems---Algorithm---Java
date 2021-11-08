class Solution {
    public String multiply(String num1, String num2) {
        
        if(num1.length() == 0 || num2.length() == 0) return "0";
        int l1 = num1.length();
        int l2 = num2.length();
        int[] res = new int[l1+l2];
        
        char c1[] = num1.toCharArray();
        char c2[] = num2.toCharArray();

        for(int i= l1 -1; i>=0; i--){
            for(int j = l2-1; j >=0; j--){
             
                int mult = (c1[i] - '0') * (c2[j] - '0');
                int current = res[i+j+1] + mult;
                res[i+j+1] = current % 10;
                res[i+j] += current / 10;
            }
        }
        
        int index = 0;
        while(index < res.length && res[index] == 0) index++;
        
        String ans = "";
        
        for(int i = index; i < res.length; i++) {
            ans += String.valueOf(res[i]);
        }
        
        if(ans.equals("")) return "0";

    return ans;
    }
}