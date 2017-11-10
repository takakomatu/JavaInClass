import java.util.*;//??
public class PrelimE5_4{
	public static void main(String[] args) {
		System.out.print("Enter three numbers: ");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		int d = a.nextInt();
		if(b==c&&c==d) System.out.println("all the same");
		if(b!=c&&c!=d&&b!=d) System.out.println("all different");//not if(b!=c&&c!=d) 
		else System.out.println("neither");
	}
}
