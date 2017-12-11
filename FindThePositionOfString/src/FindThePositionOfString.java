/*How do you find the position of the last space in a string? */

import java.util.Scanner;

public class FindThePositionOfString {
	public static void main(String args[]) {
		System.out.print("find the position of the  last space in a string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		boolean found = false;
		int i;
		i=str.length() -1;
		while (!found && i >= 0)
		{
		   char ch = str.charAt(i);
		   if (ch == ' ') {
			   found = true; 
		   }
		   else 
			   i--;
		}
		if(i==0) System.out.print(i + 1 +  "st character has the last space");
		if(i==1) System.out.print(i + 1 +  "nd character has the last space");
		if(i==2) System.out.print(i + 1 +  "rd character has the last space");
		else System.out.print(i + 1 +  "th character has the last space");
	}

}
