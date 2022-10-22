package Chapter8H;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	@Override
	public boolean withdraw(int amount) {
		if (!super.withdraw(amount)) {
			protectedBy.withdraw(amount - this.balance);

			this.balance = 0;
		}
		return true;
	}

	@Override
	public String getAccountType() {
		return "당좌예금";
	}
}
