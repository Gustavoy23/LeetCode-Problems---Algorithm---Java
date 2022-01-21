class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long left = 0;
        long right = 0;
        for(int i: piles) right = Math.max(right, i);
        
        while(left <= right) {
            long mid = left + (right-left)/2;
            
            if(kokoCan((int)mid, piles, h)) {
                right = mid -1;
            } else {
                left = mid+1;
            }
        }
    return (int)left;
    }
    
    private boolean kokoCan(int qty, int[] piles, int h) {
        int hours = 0;
        
        if(qty==0) return false;
        for(int i: piles) {
            hours+=i/qty;
            if(i % qty != 0) hours++;
        }
    return hours<=h;
    }
}