
public class ForLoopDeclaredOutsideTheHeader {
	public static void main(String args[]) {
		int counter;
		for (counter = 1; counter <= 10; counter++){
			System.out.println(counter);
		}
		System.out.println(counter);// counter still exists here
	}
}
