class CustomStack {
    List<Integer> stack;
    int size;
    int maxSize;
    public CustomStack(int maxSize) {
        stack = new ArrayList<>();
        this.maxSize = maxSize;
        size = 0;
    }
    
    public void push(int x) {
        if(size<maxSize) {
            stack.add(x);
            size++;
        }
        
    }
    
    public int pop() {

        if(!stack.isEmpty()) {
            int t = stack.get(size-1);
            stack.remove(size-1);
            size--;
            return t;
        } else{
            return -1;
        }

        
        
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i < k && i < size; i++) {
            stack.set(i, stack.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */