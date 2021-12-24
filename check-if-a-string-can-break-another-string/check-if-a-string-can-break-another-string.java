class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        
        int n = s1.length();
        int[] c1 = new int[n];
        int[] c2 = new int[n];
        
        for(int i = 0; i < n; i++) {
            c1[i] = s1.charAt(i) - 'a';
            c2[i] = s2.charAt(i) - 'a';
        }
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        int count = 0;
        for(int i = 0; i < n ; i++) {
            if(c1[i] <= c2[i]) {
                count++;
            }
        }
        
       // System.out.println(Arrays.toString(c1));
        //System.out.println(Arrays.toString(c2));
        if(count == n) return true;
        
        count = 0;
        for(int i = 0; i < n ; i++) {
            if(c2[i] <= c1[i]) {
                count++;
            }
        }
        if(count == n) return true;
        
        return false;
    }
}