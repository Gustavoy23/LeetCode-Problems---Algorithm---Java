class Solution {
    public int minimumSum(int num) {

        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i]= s.charAt(i) - '0';
            
        }
        
        Arrays.sort(arr);
        
        
        int new1 = 0;
        int new2 = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i%2==0){
                new1 = new1*10+(arr[i]);
            } else {
                new2 = new2*10+(arr[i]);
            }
            
        }
    return new1+new2;
    }
}