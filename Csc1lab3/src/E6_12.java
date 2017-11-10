import java.util.Scanner;

public class E6_12 {
	public static void main(String[] args) {
		System.out.println("rum".substring(0, 1));
		System.out.println("rum".substring(1, 2));
		System.out.println("rum".substring(2, 3));
		System.out.println("rum".substring(0, 2));
		System.out.println("rum".substring(1, 3));
		System.out.println("rum".substring(0, 3));
		
		Scanner a = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String b = a.next();
		int j = 1;
		while(j<=b.length()) {
			int i = 0;
				while(i+j<=b.length()) {
					System.out.println(b.substring(i, i + j));
					i++;
				}
		j++;

		}
	}
}
