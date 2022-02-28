class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        
        List<String> res = new ArrayList<>();
        if(nums.length == 0) return res;
        if(nums.length == 1) {
            res.add(""+nums[0]);
            return res;
        }
        int n = nums.length;
        int start = nums[0];
        if(nums[0]!=nums[1]-1) {
            StringBuilder sb = new StringBuilder();   
            sb.append(start);
            res.add(sb.toString());
            start=nums[1];
        }
            
        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i]!=nums[i+1]-1) {
                StringBuilder sb = new StringBuilder();        
                if(nums[i]==start){
                    sb.append(nums[i]);
                } else {
                    sb.append(start);
                    sb.append("->");
                    sb.append(nums[i]);
                }
                 res.add(sb.toString());
                start=nums[i+1];
            } else {
                
            }
           
        }
         StringBuilder sb = new StringBuilder(); 
        if(nums[n-1]==start) {
            
             sb.append(start);
        } else {
                   sb.append(start);
                    sb.append("->");
                    sb.append(nums[n-1]);
        }
         res.add(sb.toString());
        
    return res;
    }
}