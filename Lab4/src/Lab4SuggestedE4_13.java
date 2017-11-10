import java.util.*;
public class Lab4SuggestedE4_13 {//this doesnt have the priority but ... one below
	public static void main(String[] args) {
		System.out.print("Please enter an integer between 1,000 and 999,999: ");
		Scanner a = new Scanner(System.in);
		String b = a.next();
		int c = b.length();
		int counter = 0;
		while(counter < c) {
			char f = b.charAt(counter);
			counter++;
			if(f != ',') System.out.print(f);
		}
	
	/*Scanner input=new Scanner(System.in);
	System.out.print("Integerbetween 1000 and 999999: ");
	String number=input.next();
	input.close();
	String postfix=number.substring(number.length()-3);
	String prefix=number.substring(0,number.length()-2);
	System.out.println(prefix+postfix);*/
	
	
	}
	/*public static void main(String[] args) {
		System.out.print("Please enter an integer between 1,000 and 999,999: ");
		Scanner a = new Scanner(System.in);
		String b = a.next();
		int c = b.length();
		System.out.print(b);
		String d = b.substring(c-3);
		String e= b.substring(0,c-2);
		System.out.println(e + d);
	}*/
}
