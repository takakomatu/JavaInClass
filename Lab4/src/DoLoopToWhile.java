import java.util.Scanner;

public class DoLoopToWhile {
	public static void main(String[] args) {
		int value;
		Scanner in = new Scanner(System.in);
		do
		{
		   System.out.print("Enter an integer < 100: ");
		   value = in.nextInt();
		}
		while (value >= 100); 
		// note semicolon here!!!
		System.out.println("success");		
		
		int value2;
		boolean first = true;
		System.out.print("Enter an integer < 100: ");
		Scanner in2 = new Scanner(System.in);
		value2 = in2.nextInt();

		while (first && (value2 >= 100)) { //????
		System.out.print("Enter an integer < 100: ");
		value = in.nextInt();
		first = false;
		}
		System.out.print("success");
	}
}
