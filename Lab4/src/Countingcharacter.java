import java.util.Scanner;//????
//Count how many words in the input have at most three letters:
public class Countingcharacter {
	public static void main(String[] args) {
		System.out.print("Count the number of a character");
		Scanner in = new Scanner(System.in);
		int shortWords = 0;
		while (in.hasNext()) // is there any input at all left?
		{
		   String input = in.next();
		   if (input.length() <= 3)
		   {
		      shortWords++; // same as shortWords=shortWords+1;
		   }
		}
		System.out.print(shortWords);
	}
}
