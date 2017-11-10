import java.util.Scanner;
public class Play {
	public static void main(String[] args) {
		double startingValue;
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter starting value: ");
		startingValue = kbd.nextDouble();

		System.out.print(Math.exp(startingValue) ) ;
		
	}
}
