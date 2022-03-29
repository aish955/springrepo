package customevents;

public class SalaryAccount extends BankAccount {

	public SalaryAccount(int accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void showBalance() {
		super.toString();
		
	}

	@Override
	double withdraw(double amount) {
		if (amount >100000  ) {
			System.out.print("Withdrawal limit exceeded");
			
		}
		else
		{
			this.setAccBalance(this.getAccBalance() - amount);	
		}
		return this.getAccBalance();
	}

	@Override
	double deposit(double amount) {
		this.setAccBalance(this.getAccBalance() + amount);
		return getAccBalance();
	}

}
