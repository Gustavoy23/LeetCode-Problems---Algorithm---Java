class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int n  = tickets.length;
        int val = tickets[k];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(tickets[i] > val && i <= k) sum+= val;
            else if(tickets[i] <= val && i <= k) sum+=tickets[i];
            else if(tickets[i] > val-1 && i > k) sum+=val - 1;
            else sum+=tickets[i];
        }
    return sum;
        
    }
}