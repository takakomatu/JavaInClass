import java.util.Scanner;
public class SimpleTable {
	public static void main(String[] args) {
		double increment;
		double startingValue;
		double finalValue;
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter starting value: ");
		startingValue = kbd.nextDouble();
		System.out.print("Enter ending value: ");
		finalValue = kbd.nextDouble();
		System.out.print("Enter increment value: ");
		increment = kbd.nextDouble();
		while(startingValue<=finalValue){
			System.out.printf("%10.5f%17.5f\n", startingValue, Math.exp(startingValue) ) ;
			// Math.exp(1)=2.7.....
			startingValue += increment;
		}
	}
}
