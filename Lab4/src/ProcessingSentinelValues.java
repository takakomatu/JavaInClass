import java.util.*;
public class ProcessingSentinelValues {
	public static void main(String[] args) {
		System.out.print("Enter salaries, -1 to finish: ");
		boolean done = false;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		while (!done)
		{
			int value = in.nextInt();
			if (value == -1)
			{
	        done = true;
			} 
			else
			{
				sum = sum + value;
			}
		}
	System.out.print(sum);
	}
}
