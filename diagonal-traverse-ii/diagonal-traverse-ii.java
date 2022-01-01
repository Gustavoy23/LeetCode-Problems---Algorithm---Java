class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> list = new ArrayList<>();        
        int n = nums.size();
        int size = 0;
        
       Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            for(int j =0; j < nums.get(i).size(); j++){
                map.putIfAbsent(i+j , new ArrayList<>());
                List<Integer> arr = map.get(i+j);
                arr.add(nums.get(i).get(j));
                map.put(i+j, arr);
            }
            size+=nums.get(i).size();
        }
        
        int[] result = new int[size];
        
        int k = 0;
        for(int i = 0; i < map.size() ;i++) {
            for(int j = map.get(i).size()-1; j >= 0; j--){
                result[k++] = map.get(i).get(j);    
            }
            
        }
    return result;
    }
}