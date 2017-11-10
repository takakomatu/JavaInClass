import java.util.*;
public class Exam1Code {
public static void main(String[] args) {
	System.out.print("Whats the highest number?");
	Scanner a = new Scanner(System.in);
	int b = a.nextInt();
	Random c = new Random();
	int d = c.nextInt(b);
	int g = b-d;
	int e = c.nextInt(g);
	e = d+e;
	
	int h = b-e;
	int f = c.nextInt(h);
	f = f+d;
	d=d+1;
	e=e+1;
	f=f+1;
	System.out.print(d);
	System.out.print(" ");
	System.out.print(e);
	System.out.print(" ");
	System.out.print(f);
	System.out.print("The lottery");

}
}
