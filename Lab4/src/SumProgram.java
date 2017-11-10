import java.util.Scanner;

public class SumProgram {
	public static void main(String[] args) {
		double total = 0;
		System.out.print("Calculate the total ");
		Scanner in = new Scanner(System.in);
		while (in.hasNextDouble ()) // is there a double available from the Scanner 
		{
			double input = in.nextDouble();
			total = total + input;
		} 
		System.out.print(total);
	}
}
