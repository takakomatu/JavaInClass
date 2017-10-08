import java.util.Scanner;
import java.math.BigInteger;

public class csc1lab2 {
public static void main(String[] args) {

Scanner ReadInt = new Scanner(System.in);
System.out.print("Enter Big integer: ");
String stringInt = ReadInt.nextLine();
	 BigInteger Bigint = new BigInteger(stringInt);
	 Boolean boolenan = Bigint.isProbablePrime(1-1/2^100);
	 System.out.print("It is likely " + boolenan + " that the number is prime");
	 
	 System.out.print("Enter another big int");
	 Scanner a = new Scanner(System.in);
	 BigInteger b = a.nextBigInteger();
	 BigInteger c = b.gcd(Bigint);
	 System.out.println(c);
	 
	/* int num = "sdf".length();
	 String str = new String(12); Doesnt this work like line 10? */
}
}
