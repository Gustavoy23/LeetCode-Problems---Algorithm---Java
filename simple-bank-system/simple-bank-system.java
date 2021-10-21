class Bank {

    long[] balance;
    int n;
    public Bank(long[] balance) {
        this.n = balance.length; 
        this.balance = balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1 < 1 || account1 > n || account2 > n || account2 <1 ) return false;
        
        long t1 = balance[account1-1];
        long t2 = balance[account2-1];
        
        if(money > t1) return false;
        
        balance[account1-1] -= money;
        balance[account2-1] += money;
        
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(account > n || account < 1) return false;
        
        balance[account-1] +=money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account>  n || account < 1) return false;
        
        if(balance[account-1] < money ) return false;
        
        balance[account-1]-= money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */