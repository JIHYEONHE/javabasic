package Bank;

public class CheckingAccount extends BankAccount {
private SavingsAccount protectedBy;
public CheckingAccount(int balance) {
	super(balance);
}
public CheckingAccount(int balance,SavingsAccount protectedBy) {
	super(balance);
	this.protectedBy=protectedBy;
	
}
//잔액
//SavingsAccount: 5000원
//CheckingAccount:10000원
//1.백지수표로 7,000원자리 물건을 구매한 경우 / 2.백지수표로 13,000원자리 물건 구매한 경우
//백지수표로 13,000원자리 물건구매
//CheckingAccount 는 0원으로 만든다
//SavingAccount-(amount-CheckingAccount)
@Override
public boolean withdraw(int amount) {
	//return super.withdraw(amount);
if(!super.withdraw(amount)) {
	protectedBy.withdraw(amount-this.balance);
	//protectedBy.balance -= amount-this.balance;
	this.balance =0;
	
}return true;
}
}
