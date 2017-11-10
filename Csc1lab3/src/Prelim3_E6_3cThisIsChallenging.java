import java.util.*;
public class Prelim3_E6_3cThisIsChallenging { 
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		System.out.print(b + " ");

		int d = b;
		while(a.hasNextInt()) {
		int c = a.nextInt();
		d = d + c;

		System.out.print(d + " ");
		}
	}
}
