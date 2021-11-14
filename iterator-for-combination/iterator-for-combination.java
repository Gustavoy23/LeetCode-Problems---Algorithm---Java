class CombinationIterator {

    
    PriorityQueue<String> pq;
    public CombinationIterator(String characters, int combinationLength) {
        pq = new PriorityQueue<>();
        combinations(characters, combinationLength, 0, new StringBuilder());
    }
    
    public void combinations(String s,  int len, int start, StringBuilder sb) {
        if(len == 0) {
            pq.add(sb.toString());
            return;
        }
        
        for(int i = start; i < s.length(); i++) {
            sb.append(s.charAt(i));
            combinations(s, len -1, i+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public String next() {
        if(pq.isEmpty()) {
            return "";
        } else {
            return pq.poll();
        }
        
    }
    
    public boolean hasNext() {
        if(pq.isEmpty()) {
            return false;
        } else return true;
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */