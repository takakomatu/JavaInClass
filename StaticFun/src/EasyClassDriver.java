
public class EasyClassDriver {

	public static void main(String[] args) {
		EasyClass first = new EasyClass(5);
		EasyClass second = new EasyClass(10);
		
		System.out.println("first NS = " + first.getNonStatic());
		System.out.println("first Static = " + first.getStatic());
		System.out.println("second NS = " + second.getNonStatic());	
		System.out.println("second Static = " + second.getStatic());
		
		second.setNonStatic(-88);
		
		System.out.println("first NS = " + first.getNonStatic());
		System.out.println("first Static = " + first.getStatic());
		System.out.println("second NS = " + second.getNonStatic());	
		System.out.println("second Static = " + second.getStatic());
		
		second.setStatic(666);
		
		System.out.println("first NS = " + first.getNonStatic());
		System.out.println("first Static = " + first.getStatic());
		System.out.println("second NS = " + second.getNonStatic());	
		System.out.println("second Static = " + second.getStatic());
		
		EasyClass.printMe();
		// Known error - getNonStatic is NOT a static method
		//System.out.println("first Static = " + EasyClass.getNonStatic());
	}

}
