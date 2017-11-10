import java.util.Scanner;

public class Prelim3_E6_3d {

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
