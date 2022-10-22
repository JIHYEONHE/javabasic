package Bank;

public class BankAccount {
protected int balance;

public BankAccount(int balance) {
	this.balance = balance;
}
public int getBalance() { //잔액
	return balance;
}
public void deposit(int amount) { //입금메소드
	balance+=amount;
}
public boolean withdraw(int amount) { //출금메소드
	if(balance>=amount) {
		balance-=amount;
		return true;
	}else {
		return false;
	}
}
public boolean transfer(int amount,BankAccount otherAccount) { //현재계좌에서 amount 만큼다른계좌 송금
	if(withdraw(amount)==true) {
		otherAccount.deposit(amount);
		return true;	
	}else {
		return false;
	}
}
public String toString(){
	//return "현재 잔액:"+ balance;
	return String.format("%,d원",balance);
}
}
