class Solution {
    public int minPartitions(String n) {
        int l = n.length();
        
       int count = 0;
        int max = (n.charAt(0) - '0');
        count =max;
        for(int i = 1; i < l; i++){
            char c = n.charAt(i);
            int value = c - '0';
            if(value > max){
                count+= value - max;
                max = value;
            }
            
        }
        
    return count;
    }
}