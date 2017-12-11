/*Cumulative totals. For example, if the input is 1 7 2 9, the program should print 1 8 10 19. */
import java.util.*;
public class Prelim3_E6_3cThisIsChallenging { 
	public static void main(String[] args) {
		System.out.print("Enter integers: ");
		Scanner a = new Scanner(System.in);
		int first = a.nextInt();
		System.out.print(first + " ");

		int sum = first;
		while(a.hasNextInt()) {
		int input = a.nextInt();
		sum = sum + input;

		System.out.print(sum + " ");
		}
	}
}
