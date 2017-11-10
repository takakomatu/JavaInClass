import java.util.Scanner;

public class E6_3b {
	public static void main(String[] args) {
		System.out.print("integers");
		Scanner a = new Scanner(System.in);
		while(a.hasNextInt()) {
			int b = a.nextInt();
			if(b%2==0) {
				System.out.print("even: ");
				System.out.println(b);
			}
			if(b%2!=0) {
				System.out.print("odd: ");
				System.out.println(b);
			}
		}
	
	
	}
}
