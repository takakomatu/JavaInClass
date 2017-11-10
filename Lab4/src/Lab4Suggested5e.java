import java.util.Scanner;
public class Lab4Suggested5e {
	public static void main(String[] args) {
		double startingValue, counter=1;
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter starting value: ");
		startingValue = kbd.nextDouble();
		while(counter<=startingValue){
			System.out.printf("%4.0f%17.0f\n", counter, Math.pow(counter, 2));
			counter++;
		}
	}
}
