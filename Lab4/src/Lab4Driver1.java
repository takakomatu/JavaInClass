public class Lab4Driver1
{
    public static void main(String args[])
    {
	StringCrypt rotate4 = new StringCrypt(4);

	System.out.println("=SIMPLE ENCRYPTION TEST (using handout examples)");

	
	System.out.printf("%s%-20s\n%s%-20s\n",
			  "Expected: ", "decrypt",
			  "  Actual: ", rotate4.decrypt("abcde") );	
	
	
	System.out.printf("%s%-20s\n%s%-20s\n",
					  "Expected: ", "lipps",
					  "  Actual: ", rotate4.encrypt("hello") );

	System.out.printf("%s%-20s\n%s%-20s\n",
			  "Expected: ", "dss",
			  "  Actual: ", rotate4.encrypt("zoo") );

	System.out.printf("%s%-20s\n%s%-20s\n",
			  "Expected: ", "fyddiv",
			  "  Actual: ", rotate4.encrypt("buzzer") );

	System.out.printf("%s%-20s\n%s%-20s\n",
			  "Expected: ", "woctid",
			  "  Actual: ", rotate4.encrypt("skypez") );
	
    }
}
