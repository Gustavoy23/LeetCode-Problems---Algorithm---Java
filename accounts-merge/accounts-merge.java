class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
        int n = accounts.size();
        unionFind uf = new unionFind(n);
        Map<String, Integer> acc = new HashMap<>();
    
        for(int i = 0; i < n;i++){
            
            List<String> account = accounts.get(i);
            List<String> emails = account.subList(1, account.size());
            for(String email: emails) {
                if(!acc.containsKey(email)){
                    acc.put(email, i); 
                } else {
                    int prevAcc = acc.get(email);
                    uf.union(prevAcc, i);
                }
            }
        }
        
        Map<Integer, Account> rootAccounts = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            List<String> account = accounts.get(i);
            
            int rootAccount = uf.getParent(i);
            
            if(!rootAccounts.containsKey(rootAccount)) {
                String rootAcc = accounts.get(i).get(0);
                rootAccounts.put(rootAccount, new Account(rootAcc));
            } 
            
            List<String> emails = account.subList(1, account.size());
            rootAccounts.get(rootAccount).emails.addAll(emails);
        }
        
        List<List<String>> res = new ArrayList<>();
        
        for(Account values: rootAccounts.values()) {
            List<String> temp = new ArrayList<>();
            List<String> set = values.toStringList();
            for(String s: set){
                temp.add(s);
            }
            res.add(temp);
        }
        
        return res;
    }
    
    class unionFind {
        
        int[] parent;
        private unionFind(int n){
            parent = new int[n];
            for(int i=0; i < n ;i++) parent[i]=i;
        }
        
        public void union(int x, int y) {
            int px = getParent(x);
            int py = getParent(y);
            
            if(px!=py) {
                parent[px] = py;
            }
            
        }
        
        public int getParent(int i) {
            if(parent[i] == i) {
                return i;
            }
            
            return getParent(parent[i]);
        }
        
    }
    
    class Account {
        String name;
        Set<String> emails = new TreeSet<>();
        
        Account(String name) {
            this.name = name;
        }
        
        List<String> toStringList() {
            List<String> list = new ArrayList<>();
            list.add(name);
            list.addAll(emails);
            return list;
        }
        
    }
    
        
}