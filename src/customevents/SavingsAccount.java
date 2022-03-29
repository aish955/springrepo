package customevents;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(int accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	
	 void showBalance() {
		super.showBalance();	
	}

	@Override
	double withdraw(double amount) {
		if (amount > 30000) {
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
		if(amount > 1000000) {
			System.out.println("Deposit limit exceeded");
		}else {
			this.setAccBalance(this.getAccBalance() + amount);
		}
		return this.getAccBalance();
			
	}

}
