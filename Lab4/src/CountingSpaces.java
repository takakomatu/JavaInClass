import java.util.Scanner;
public class CountingSpaces {
	public static void main(String[] args) {
		System.out.print("Count the number of spaces in a string ");
		Scanner in = new Scanner(System.in);
		int spaces = 0;
		String str = in.nextLine();
		for (int i = 0; i < str.length(); i++)
		{
		   char ch = str.charAt(i);
		   if (ch == ' ')
		   {
		      spaces++;
		   }
		}
		System.out.print(spaces);
	}
}
