/*All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the program should print 3 5 6. */

import java.util.Scanner;

public class Prelim3_E6_3d {//this code is incomplete

public static void main(String[] args) {
	System.out.print("numbers?");
	Scanner a = new Scanner(System.in);
	int next;
	int prev;
	int prevprev;
	next = a.nextInt();
	while(a.hasNextInt()) {
		while(a.hasNextInt()){
			prev = next;
			next = a.nextInt();
			if(next==prev) {
				 System.out.print(next);
			 }
		}
	}
}
}
