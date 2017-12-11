/*All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the program should print 3 5 6. */
import java.util.Scanner;

public class E6_3dThisIsDifficult {//this is equal to Prelim3_E6_3d

public static void main(String[] args) {
	boolean c, d=false, e=true;
	
	c= true && false || false||false;
	System.out.println(c);

	System.out.print("numbers?");
	Scanner a = new Scanner(System.in);
	
	int next;
	int prev;
	next = a.nextInt();
	boolean b = false;
	while(a.hasNextInt()) {
		while(a.hasNextInt()){
			prev = next;
			next = a.nextInt();
			if(next==prev) {
				 if(!b) {
					 System.out.print(next);
				 	 b = true;
				 }
			}
			else
				b = false;
		}
	}
}
}
