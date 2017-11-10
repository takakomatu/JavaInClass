
public class Prelim3_5_32{
	public static void main(String[] args) {
		int n = 0;
		boolean b;
		b=n==0;
		System.out.println(b);

		b=n!=0;
		System.out.println(b);
		
		b=false;
		if(n>1) {if(n<2) {b=true;}}
		System.out.println(b);

		if(n>1&&n<2) b=true;
		System.out.println(b);

		if(n>1&&n<2) b=false;
		else b=true;
}
}
