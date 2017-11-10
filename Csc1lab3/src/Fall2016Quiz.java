
public class Fall2016Quiz {
	public static void main(String[] args) {
		System.out.print("This quiz is ");
		{
			if(1==999)
				System.out.print("not ");
				System.out.print("very ");
			
				{}//this compiles
		}
		System.out.print("easy! ");
		
		int a = 0, b = 0, max = 50, f=7;		
		System.out.print(a);
		System.out.print(b);
		System.out.println(max);
		
		boolean c = true, d = false, e = true;
		System.out.println(((c||d )&& !e) && e);
		System.out.println((c||d && !e) && e);
		System.out.println(c||d && !e && e);
		
		c = true||b<f&&a<b||false||false&&true;
		System.out.println(c);



	}
}
