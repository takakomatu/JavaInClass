
public class Printf2 {
	public static void main(String[] args) {
	int quantity = 132423423; 
	double total = 3.456789;
	System.out.printf("Quantity:%d Total: %10.2f", quantity, total);
	System.out.println();

	int volume = 10;
	System.out.printf("The volume is%5d", volume);//There are four spaces between is and 10
	System.out.println();

	int bottle = 6;
	int cans = 812;
	System.out.printf("Bottles: %8d\n", bottle); // \n = newline
	System.out.printf("Cans:    %8d\n", cans);//the % of Bottles should be lined up with % of Cans
	
	System.out.printf("%-9s%8d\n%-9s%8d\n", "Bottles: ", bottle, "Cans: ", cans);
	}
}
