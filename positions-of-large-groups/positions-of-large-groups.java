class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int n = s.length();
        int left = 0;
        List<List<Integer>> res = new ArrayList<>();
        if(s.length() < 3) return res;
        for(int i = 1; i < n; i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
               continue; 
            }  else {
                if(i - left >= 3) {
                    List<Integer> list = new ArrayList<>();
                    list.add(left);
                    list.add(i-1);
                    res.add(list);
                    left = i;
                } else {
                    left = i;
                }

            }   
            
   
        }
            
        
        if(s.charAt(n-2) == s.charAt(n-1)){
            if(n - left >=3){
                List<Integer> list = new ArrayList<>();
                list.add(left);
                list.add(n-1);
                res.add(list);
            }
        }
    return res;
    }
}