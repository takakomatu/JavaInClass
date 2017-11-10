
public class BankAccountDriver {

	public static void main(String[] args) {
		
		BankAccount savings = new BankAccount(23.99);
		
		BankAccount checking = new BankAccount(1);
		
		
		System.out.println("my balance = " + savings.getBalance() );
		
		savings.makeDeposit(42.0);
		
		System.out.println("my balance = " + savings.getBalance() );
		
		savings.withdraw(1000000.00);

		System.out.println("my balance = " + savings.getBalance() );
		
		System.out.println("checking balance = " + checking.getBalance() );
		
	}

}
