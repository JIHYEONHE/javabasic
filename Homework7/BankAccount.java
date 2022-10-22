package Homework7;

public class BankAccount {
private int balance;

public BankAccount(int balance) {
	this.balance = balance;
}
public int getBalance() { //잔액
	return balance;
}
public void deposit(int amount) { //amount :금액
	this.balance+=amount;
}
public boolean withdraw(int amount) { //출금메소드
	if(this.balance>amount) {
	this.balance-=amount;
		return true;
	}else {
		return false;
	}
}
public boolean transfer(int amount,BankAccount otherAccount) { //금액/이체계좌번호/ 현재계좌에서 amount 만큼다른계좌 송금
	if(withdraw(amount)) {
	otherAccount.deposit(amount);
	return true;
	}
	return false;
}

}
