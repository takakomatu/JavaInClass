import java.util.*;
public class E5_4 {
public static void main(String[] args) {
	System.out.print("three integers");
	Scanner a = new Scanner(System.in);
	int b = a.nextInt();
	int c = a.nextInt();
	int d = a.nextInt();
	if(b==c && c ==d) {
		System.out.print("all the same");
	}
	else if(b!=c&&c!=d&&b!=d) System.out.print("all diff");// =if(b!=c&&c!=d&&b!=d) cuz b!=c&&c!=d&&b!=d has already excluded the cases of b==c && c ==d
	else System.out.print("neither");
}
}
