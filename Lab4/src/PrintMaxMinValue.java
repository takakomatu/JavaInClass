import java.util.Scanner;

public class PrintMaxMinValue {
	public static void main(String[] args) {
		System.out.print("Print the max value ");
		Scanner in = new Scanner(System.in);
		double largest = in.nextDouble();
		double smallest = in.nextDouble();
		while (in.hasNextDouble())
		{
		   double input = in.nextDouble();
		   if (input > largest)
		   {
		      largest = input;
		   }
		   if (input < smallest)
		   {
		      smallest = input;
		   }
		}
		System.out.println(largest);
		System.out.print(smallest);
	}
}
