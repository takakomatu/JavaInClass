import java.util.*;
public class CountingMatches {
	public static void main(String args[]) {
		int shortWords = 0;
		System.out.print("Count the number of strings that is less than 4 characters: ");
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) // if "in" is a keyboard bsed Scanner, this will always return true, since the user could always
		{//type more at the keyboard and Java has no way to know if the user will do that or not.
		   String input = in.next();
		   if (input.length() <= 3)
		   {
		      shortWords++; // same as shortWords=shortWords+1;
		      System.out.println(shortWords);
		   }
		}
	    System.out.println("the loop doesnt end so this will not be printed out :( ");
	}
}
