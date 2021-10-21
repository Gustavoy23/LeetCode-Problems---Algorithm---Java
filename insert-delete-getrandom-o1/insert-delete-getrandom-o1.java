class RandomizedSet {
    
    Random rand;
    Map<Integer, Integer> map;
    List<Integer> list;
    public RandomizedSet() {
        rand = new Random();
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val, list.size());
            list.add(val);
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)) {
            int last = list.size()-1;
            
            if(val == list.get(last)){
                map.remove(val);
                list.remove(list.size()-1);
                return true;
            }
            
            int index = map.get(val);
            map.put(list.get(last), index);
            list.set(index, list.get(last));
            //System.out.println(index + " "+ last);
            list.remove(list.size()-1);
            map.remove(val);
        return true;
            
        } else {
            return false;
        }
    }
    
    public int getRandom() {
        int i = 0;
        int value = rand.nextInt(list.size());
        return list.get(value);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */