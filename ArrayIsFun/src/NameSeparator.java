
public class NameSeparator {
	public static void main(String args[]) {
		String[] names = new String[4];
		for (int i = 0; i < names.length; i++)
		{
		   if (i > 0) { System.out.print(" | "); }
		   System.out.print(names[i]);
		}
		System.out.println();

		System.out.print(names[0]);
		for (int i = 1; i < names.length; i++)
		{
		   System.out.print(", " + names[i]);
		}
	}
}
