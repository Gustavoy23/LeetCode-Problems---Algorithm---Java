class Solution {
    int memo[];
    int m;
    public int maxIceCream(int[] costs, int coins) {    
        Arrays.sort(costs);
        int sum = 0;
        m = 0;
        for(int i = 0; i < costs.length;i++){
            sum+=costs[i];
            if(sum == coins){
                m = i+1;
                break;
            } else if(sum > coins) {
                m = i;
                break;
            }
        }
    if(sum < coins) return costs.length;
     return m;   
    }
}