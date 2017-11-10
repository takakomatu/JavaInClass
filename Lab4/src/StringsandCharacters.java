
public class StringsandCharacters {
	public static void main(String[] args) {
		String name = "Harry";
		char start = name.charAt(0);
		char last = name.charAt(4);
		System.out.println(start);
		System.out.println(last);
		String greeting = "Hello, World!";
		String sub = greeting.substring(0, 5); // sub is "Hello” (not “Hello,”)
		System.out.println(sub);//inclusive and exclusive
		String tail = greeting.substring(7);
		System.out.println(tail);//inclusive and exclusive
		String str = "Harry";
		int n = str.length();
		String mystery = str.substring(0, 1) + str.substring(n - 1, n);
		System.out.println(mystery);
	}
}
