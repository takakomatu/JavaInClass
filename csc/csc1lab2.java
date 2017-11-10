		import java.util.Scanner;
		import java.math.BigInteger;

		public class csc1lab2{
		public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Big integer: ");
		String scanner2 = scanner.next();
			 //		int scanner2 = scanner.nextInt();

		BigInteger Bigint = new BigInteger(scanner2);// so scanner2 has to be a string?? in BigInteger??
		Boolean boolenan = Bigint.isProbablePrime(1-1/2^100);
		System.out.print("It is likely " + boolenan + " that the number is prime");
			 
		
	

		}
		}
		
		
		/*Like       //enter 1212 returns 1212?? String but number??
		
		
		
		Scanner n = new Scanner(System.in);
		System.out.print("Enter a large integer: ");
		/*Like	     Scanner inte = new Scanner(System.in); //enter 1212 returns 1212?? String but number??
		System.out.print("Enter int: ");		
	     String Line = inte.next();
			System.out.println("you entered: " + Line); ???*/
		
		/*BigInteger largeInt = n.nextBigInteger();
		System.out.print(largeInt);

		BigInteger boolean = largeInt.getPrimeP();*/
