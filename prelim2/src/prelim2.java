import java.util.Scanner;
import java.math.BigInteger;
import java.awt.Rectangle;
import java.util.Random;
public class prelim2 {
public static void main(String[] args) {
	
System.out.print("Enter meter");
Scanner scan = new Scanner(System.in);
double meter = scan.nextDouble();
double mile, foot, inch;
mile = meter/1609.34;
foot = mile * 5280;
inch = foot * 12;
System.out.print("mile:" + mile);
}
}
