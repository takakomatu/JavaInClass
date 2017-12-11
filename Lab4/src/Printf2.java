	
public class Printf2 {
	public static void main(String[] args) {
		int quantity = 123; 
		int quantity1= 1234; 
	double total = 3.456789;
	
	System.out.printf("Quantity: %-10d", 123);
	System.out.println();
	
	System.out.printf("Quantity: %-10d", 1234);
	System.out.println();	
	System.out.printf("Quantity: %10d", 1234);
	System.out.println();
	
	System.out.printf("Quantity:%dTotal:%5.2f", 123, 3.456789);
	System.out.println();

	int volume = 10;
	System.out.printf("The volume is%5d", volume);//There are four spaces between is and 10
	System.out.println();

	int bottle = 6;
	int cans = 812;
	System.out.printf("Bottles: %3d\n", bottle); // \n = newline
	System.out.printf("Cans:    %3d\n", cans);//the % of Bottles should be lined up with % of Cans
	
	System.out.printf("%-9s%8d\n%-9s%8d\n", "Bottles: ", bottle, "Cans: ", cans);
	}
}
