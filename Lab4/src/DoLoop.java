import java.util.*;
public class DoLoop {
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
		Scanner in2 = new Scanner(System.in);
		do
		{
		   System.out.print("Enter an integer 0< < 100: ");
		   value2 = in2.nextInt();
		}
		while (value2<=0||value2 >= 100); // note semicolon here!!! negation of 0< < 100
		System.out.print("success");
	}
}
