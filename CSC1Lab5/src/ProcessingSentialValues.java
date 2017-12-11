import java.util.*;
public class ProcessingSentialValues {
	public static void main(String args[]) {
		System.out.print("Enter salaries, -1 to finish: ");
		Scanner a = new Scanner(System.in);
		boolean done = true;
		double sum = 0;
		while (done)
		{
			double value = a.nextDouble();
			if (value == -1)
			{
				done = false;
			}
			else
			{
				sum = sum + value;
			}
		} 
		System.out.println("Sum of salaries: " + sum);				
		
		
		System.out.print("Enter salaries, -1 to finish: ");
		Scanner b = new Scanner(System.in);
		double value1, sum1 = 0;
		do
		{
			value1 = b.nextDouble();
			if(value1!=-1)
				sum1 = sum1+value1;
		} 
		while(value1!=-1.0||value1!=-1);
		System.out.print("Sum of salaries: " + sum1);		
	}
}
