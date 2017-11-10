import java.util.Scanner;

public class E6_3a {
	public static void main(String[] args) {
		System.out.print("Enter integers: ");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int largest = b;
		int smallest = b;
		while(a.hasNextInt()) {
			int c = a.nextInt();
/*error with this	int largest = b;
					int smallest = b;*/

			if(largest<c) largest = c;
			if(smallest>c) smallest = c;

		}
		
		System.out.print("largest: ");
		System.out.println(largest);

		System.out.print("smallest: ");
		System.out.println(smallest);

	}
}
