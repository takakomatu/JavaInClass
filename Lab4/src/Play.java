import java.util.Scanner;
public class Play {
	public static void main(String[] args) {
		System.out.printf("%-9d\n", 123);
		System.out.printf("%-4d\n", 123);
		System.out.printf("%-9d\n %-4d\n", 123, 123);
		double startingValue;
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter starting value: ");
		startingValue = kbd.nextDouble();

		System.out.print(Math.exp(startingValue) ) ;
		
	}
}
