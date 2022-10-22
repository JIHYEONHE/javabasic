package Homework7;

public class Customer {
private String firstName;
private String lastName;
private BankAccount account;

public Customer(String firstName,String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
}
public String getFirstName() { //이름
	return  firstName;
}
public String getLastName() { //성
	return lastName;
}
public BankAccount getAccount() {
	return account;
}
public void setAccount(BankAccount account) {
	this.account=account;
}
public String toString() {
	//return "고객의 이름:"+firstName+lastName+"잔고:"+ account.getBalance()+"원";
return String.format("이름: %s %s, 잔고: %,d원",firstName,lastName,account.getBalance());
}
}
