import java.util.*;
public class Prelim3 {
public static void main(String[] args) {
	int n, k, r; //R5.1
	n=1;
	k=2;
	r=3;
	if(r>n+k) {r=2*n;}
	else {k=2*r;}
	System.out.println(n);
	System.out.println(k);
	System.out.println(r);

	double x =Math.sqrt(2);  //R5.4
	int y =2;
	if(x * x == y) System.out.println(x);
	else System.out.println(y);
	
	x=1000000000;//R5.2
	y=1;
	int s=0;
	if(x>0)s++;
	if(y>0)s++;
	System.out.println(s);
	s=0;
	if(x>0)s++;
	else if(y>0)s++;
	System.out.println(s);
	
	int sum=0;
	Scanner in = new Scanner(System.in); //R5.3
	if (in.hasNextInt()){ 
	x = in.nextInt();
	}
	else System.out.println("bad");

}
}
