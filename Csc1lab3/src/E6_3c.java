import java.util.Scanner;

public class E6_3c {
	public static void main(String[] args) {
		System.out.print("integers?");
		Scanner a = new Scanner(System.in);
		int sum = 0;
		while(a.hasNextInt()) {
			int b = a.nextInt();

			sum = sum + b;
			System.out.print(sum + " ");
		}
	}
}
