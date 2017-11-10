import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
public class csc1lab2 {
public static void main(String[] args) {
	StringBuilder a;
	a = new StringBuilder("desserts"); //does the constructor(method) start with capital letter??
	StringBuilder b1 = a.reverse();//toString is accessor but not mutator.
	String a3 = a.reverse().toString();
	System.out.println(a); 
	System.out.println(a.reverse().toString()); //its returing something 
	System.out.println(a); 

	String a1 = "Hello";
	String b = a1;
	a1.toUpperCase();//no method in string class is a mutator but accessor
	System.out.println(b); 
	System.out.println(a1);//????
	
	String fsd = "Mississipi";
	String sdf = fsd.replace("ss", "pp");
	System.out.println(fsd);
	System.out.println(sdf);
	//none of the String class method are mutator. they are all accessors
	
System.out.print("Enter int: ");
Scanner scan = new Scanner(System.in); //enter 1212 returns 1212?? String but number??
BigInteger scan2 = scan.nextBigInteger();

System.out.print(scan2);
boolean bo = scan2.isProbablePrime(1-1/2^100); 
System.out.print(bo);
}
}
