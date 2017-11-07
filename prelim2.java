import java.util.Scanner;
import java.awt.Rectangle;
import java.math.BigInteger;
public class prelim2 {
public static void main(String[] args) {
System.out.print("What is your large integer? ");
Scanner scan = new Scanner(System.in);
BigInteger scan2 = scan.nextBigInteger();
Boolean big = scan2.isProbablePrime(1-1/2^100);
System.out.print(big); 

Scanner ReadInt = new Scanner(System.in);
System.out.print("Enter Big integer: ");
String stringInt = ReadInt.nextLine();
 BigInteger Bigint = new BigInteger(stringInt);
 Boolean boolenan = Bigint.isProbablePrime(1-1/2^100);
 System.out.print("It is likely " + boolenan + " that the number is prime");

"sdf".length();

//  String str = new String(num); Doesnt this work like line 10?

}
}