
public class Lab5_4 {
	private int notStatic;
	private static int isStatic;
	
	public Lab5_4(int a, int b) {
		notStatic =a;
		isStatic =b;
	}
	public void setNotStatic(int newVal) //part(c)
	//public static void setNotStatic(int newVal) 
	{
		notStatic = newVal;
	}
	
	//public void setStatic(int newVal) //part(b)
	public static void setStatic(int newVal) //this compiles
	{
		isStatic = newVal;
	}	
		
	public String toString() {
		return "nonstatic="+notStatic+", static="+isStatic;
	}
	
	public static void main(String args[]) {
		Lab5_4 sc = new Lab5_4(1, 2);
		System.out.println(sc);
		Lab5_4 another = new Lab5_4(99, 42);
		System.out.println(another);
		System.out.println(sc);		
		sc.setNotStatic(-8);
		System.out.println(another);
		System.out.println(sc);
		sc.setStatic(-999);
		System.out.println(another);
		System.out.println(sc);
	}
}
