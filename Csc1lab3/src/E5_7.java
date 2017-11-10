import java.util.Scanner;

public class E5_7 {
public static void main(String[] args) {
	System.out.print("enter three numbers");
	Scanner a = new Scanner(System.in);
	int b = a.nextInt();
	int c = a.nextInt();
	int d = a.nextInt();
	if(b<=c&&c<=d) {
		System.out.print("in order1");
	}
	else if(d<=c&&c<=b) { //!= else if(d<=c&&c<=b)
		System.out.print("in order2");
	}
	else{
		System.out.print("not in order");
	}
}
}
