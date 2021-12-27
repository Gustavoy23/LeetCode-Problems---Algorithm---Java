class Solution {
    public int minimumBuckets(String s) {
        int n = s.length();
        
        if(n == 1) {
            if(s.charAt(0) == 'H') {
                return -1;
            } else {
                return 0;
            }
        }
        
        int houses = 0;
        for(int i = 0; i < n; i++ ) {
            if(s.charAt(i) == 'H') houses++;
        }
        
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 1; i < n-1; i++) {
            if(s.charAt(i-1) == 'H' && s.charAt(i+1) == 'H' && s.charAt(i)=='.' && !set.contains(i-1)){
                set.add(i-1);
                set.add(i+1);
                count++;
            }
        }
    
    if(set.size() == houses) return count;
        
    for(int i = 0; i < n; i++) {
        if(!set.contains(i)) {
            if(s.charAt(i) ==  'H') {
                if(i==0) {
                    if(s.charAt(i+1) == '.'){
                        set.add(i);
                        count++;
                      }
                } else if(i==n-1){
                    if(s.charAt(i-1) == '.'){
                        set.add(i);
                        count++;
                    }
                } else {
                  if((i >0 && s.charAt(i-1) == '.' )|| (i<n-1 && s.charAt(i+1) == '.')){
                       set.add(i);
                      count++;
                }
                }
            }
        }
    }
        
    if(set.size() == houses) return count;
    return -1;
    }
}