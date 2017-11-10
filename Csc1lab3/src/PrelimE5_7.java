import java.util.Scanner;
public class PrelimE5_7{
	public static void main(String[] args) {
		System.out.print("Enter three integers: ");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		int d = a.nextInt();
		if(b<=c && c<=d) 
		System.out.println("in order");
		else if(d<=c && c<=b) System.out.println("in order"); //is it fine for else if to have intersection with if like
		else System.out.println("not in order");				//5 5 5 
	}
}
