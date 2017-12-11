
public class PlusPlusMinusMinusBeforeAfter {
	public static void main(String[] args) {
		int a = 0;
		int b;

		b = a++;
		System.out.println(a);//after storing, raise the value
		System.out.println(b);
		
		int c = 0;
		int d;

		d = ++c;
		System.out.println(c);//before storing, raise the value
		System.out.println(d);
		
		double e = 1;
		//int f = e;
	}
}
