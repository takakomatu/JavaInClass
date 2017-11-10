import java.util.*;
public class Csc1lab3 {
	public static void main(String[] args) {
System.out.print("Enter loan amount: ");
Scanner a = new Scanner(System.in);
	double balance = a.nextDouble();
	
	System.out.print("Enter monthly interest rate: ");
	Scanner b = new Scanner(System.in);
		double interestRate = b.nextDouble();
		
		System.out.print("Enter proposed monthy payment: ");
		Scanner c = new Scanner(System.in);
			double monthlyPayment = c.nextDouble();
			double interest = 0;
			
		int i = 0;
		while(interest < monthlyPayment && balance > 0) {
			interest = interestRate * balance;
			if(i == 24) {
				interestRate = interestRate *2;
				System.out.println("  **** Warning: Interest rate adjusted to: " + interestRate);
				interest = balance * interestRate;
			}
			
			if(i == 120) {
				interestRate = interestRate *2;
				System.out.println("  **** Warning: Interest rate adjusted to: " + interestRate);
				interest = balance * interestRate;
			}
			
			i = i +1;
			balance = balance - monthlyPayment + interest;
			

			System.out.println("Payment #" + i + " Interest: " + interest + "  Balance: " + balance);
			if(i != 24) interest = balance * interestRate;
			if(i != 120) interest = balance * interestRate;	
		}
		
		if(interest > monthlyPayment) 
			System.out.print("  **** You will never pay this loan back!");

	}}
