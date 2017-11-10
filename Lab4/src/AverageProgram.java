import java.util.Scanner;
public class AverageProgram {//????????
	public static void main(String[] args) {
		System.out.print("Calculate the average: ");
		Scanner in = new Scanner(System.in);
		double total = 0;
		int count = 0;
		while (in.hasNext())
		{
		   double input = in.nextDouble();
		   total = total + input; 
		   count++;
		}
		double average = 0;
		if (count > 0) // why should we check this?
		{
		   average = total / count;
		   System.out.print(average);
		}
	}
}
