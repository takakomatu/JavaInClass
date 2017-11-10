import java.util.Scanner;

public class ProcessCharacters {

	public static void  main(String args[])
	{
		System.out.println((char)122);
		System.out.println(-27%26);
		System.out.println((int) 'z');
		System.out.println(-1/26);

		System.out.print((int) 'z');
		
		Scanner kbd = new Scanner(System.in);
		
		String input = kbd.next();
		
		String answer = "";
		
		for(int pos=0; pos < input.length(); pos++)
		{
			char currentChar = input.charAt(pos);
			
			//process currentChar
			currentChar = (char) (currentChar + 1);
			
			answer =answer  + currentChar;
			
		}
		
		System.out.print(answer);
	}
}
