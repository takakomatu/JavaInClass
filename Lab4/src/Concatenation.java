
public class Concatenation {
	public static void main(String[] args) {
		String fName = "Harry";
		String lName = "Morgan";
		String name = fName + lName; 
		System.out.println(name);
		String name2 = fName + " " + lName;
		System.out.println(name2);
		
		String jobTitle = "Agent";
		int employeeId = 7;
		String bond = jobTitle + employeeId;
		System.out.println(bond);
		/*If one of the arguments of the + operator is a String 
	1. The other is forced to become to a String: 
	2. Both Strings are then concatenated*/

	}
}