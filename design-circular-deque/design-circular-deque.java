class MyCircularDeque {
    ArrayDeque<Integer> dq;
    int k;
    public MyCircularDeque(int k) {
        this.k = k;
        dq = new ArrayDeque<>();        
    }
    
    public boolean insertFront(int value) {
       if(isFull()){ 
           return false;
       }else{
            dq.offerFirst(value); 
            return true;  
        }   
    }
    
    public boolean insertLast(int value) {
       if(isFull()){ 
           return false;
        }else{
            dq.offerLast(value);
            return true;
        }
    }
    
    public boolean deleteFront() {
       if(isEmpty()) {
           return false;
       } else{
        dq.pollFirst();
          return true;
       }

    }
    
    public boolean deleteLast() {
         if(isEmpty()) {
           return false;
       } else{
           dq.pollLast();
            return true;
         }
    }
    
    public int getFront() {
       if(!dq.isEmpty())  
           return dq.peekFirst();
        else return -1;
    }
    
    public int getRear() {
       if(!dq.isEmpty()) return dq.peekLast();
        else return -1;
    }
    
    public boolean isEmpty() {
        return dq.isEmpty();
        
    }
    
    public boolean isFull() {
        return dq.size()==k;
        
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */