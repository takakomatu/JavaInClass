
public class MothTester {
	public static void main(String[] args) {
		Moth moth = new Moth(0.0);
		moth.moveToLight(12.0);
		System.out.println(moth.getPosition());
		System.out.println("Expected: 6");
		moth.moveToLight(0.0);
		System.out.println(moth.getPosition());
		System.out.println("Expected: 3");

	}
}
