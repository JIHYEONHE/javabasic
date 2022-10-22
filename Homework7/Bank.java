package Homework7;

public class Bank {
private Customer[] customers; //=null; = new Customer[10];
private int numberOfCustomers; //고객들의 수 
//
public Bank() {
	customers = new Customer[10]; //배열초기화
}
public void addCustomer(Customer customer) {
	customers[numberOfCustomers++] = customer; 

}
public int getNumberOfCustomers() {
	return numberOfCustomers;
}
public Customer[] getCustomers() {
	return customers;
}
public Customer getCustomer(int index) {
	return customers[index];
}
}
