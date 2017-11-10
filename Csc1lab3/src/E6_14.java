import java.util.Scanner;

public class E6_14 {

	public static void main(String[] args) {
		System.out.print("Enter a integer: ");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		while(b/2!=0){
			System.out.println(b%2);

	b = b/2;
	}
		System.out.println(b%2);

}

}
