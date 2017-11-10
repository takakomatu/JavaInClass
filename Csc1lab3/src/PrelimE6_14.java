import java.util.*;
public class PrelimE6_14 {
	public static void main(String[] args) {
		System.out.print("Enter integer: ");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = b/2;
/*		boolean c == 0;
		for(c != 0) {
			System.out.println(b%2);*/
		
		while(b!=0) {
			System.out.println(b%2);
			b = b/2;
		}
			

		
		
		
	}
}
