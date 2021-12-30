class Solution {
    List<String> res;
    public List<String> addOperators(String num, int target) {
        res = new ArrayList<>();
        backtracking(num, target, "", 0,0,0);
        return res;
    }
    
    private void backtracking(String num, int target, String path, long resSofar, long prev , int index) {

        
        if(index == num.length()){
            if(resSofar == target){
                res.add(new String(path));
                return;
            } 
        }
        

        for(int i = index; i < num.length(); i++) {

            if(i>index && num.charAt(index) == '0')  break;
            String c = num.substring(index,i+1);
            long currNumber = Long.parseLong(c);

            if(index == 0){    
                backtracking(num, target, path+currNumber,  currNumber, currNumber, i+1);
            } else {
                backtracking(num, target, path + "+"+ currNumber, resSofar + currNumber, currNumber, i+1);
                backtracking(num, target, path + "-" +currNumber, resSofar - currNumber, -currNumber, i+1);
                backtracking(num, target, path + "*" +currNumber, resSofar - prev + prev*currNumber, currNumber*prev, i+1);
 
        }
        }
        
    }
}