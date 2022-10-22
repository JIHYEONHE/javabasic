package Chapter10.Homework;
//balance 잔액 withdraw 출금  
		public abstract class BankAccount {
    	protected int balance;
    	public BankAccount(int balance) {
    		this.balance = balance;
    	}

    	public int getBalance() {
    		return balance;
    	}

    	
    	public void deposit(int amount) {
    		this.balance += amount;
    	}
    
    	public boolean withdraw(int amount) { 
    		if (this.balance > amount) {        
    			this.balance -= amount;
    			return true;
    		}
    		return false;
    		
    		
    	}
    	//amount값이 음수or balance 보다 크면 IllegalArgumentException
    	//otherAccount 가 null이면 NullPointerException
    	public boolean transfer(int amount, BankAccount otherAccount){
    		if (this.balance<amount||amount<0) {
    			throw new IllegalArgumentException();
    		}
    		if(otherAccount==null) {
    			throw new NullPointerException();
    		}
    	
    	
    		if (withdraw(amount)) { //출금이 되면
    			otherAccount.deposit(amount); //출금된 금액을 다른계좌에 넣어줌
    			return true;
    		}
    		return false;
    	}
    	
    	public abstract String getAccountType();
    	@Override
    	public String toString() {
    		return String.format("%,d", balance);
    	}
    }
