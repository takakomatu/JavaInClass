
public class BankAccount {

	private double balance;
	
	/*public BankAccount()
	{
		balance = 0;
	}*/
	
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	
	public void makeDeposit(double amount)
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount)
	{
		if (amount<=balance)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Fraud alert!");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
}
