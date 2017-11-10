
public class Printf {
	public static void main(String[] args) {
		double price = 1.234567;
		System.out.printf("%.2f", price);
		System.out.println();
		System.out.printf("%f", price);
		System.out.println();
		System.out.printf("%10.2f", price);//Six spaces followed by the four characters 1.23, total of 10 spaces
		System.out.println();
		System.out.printf("Price per liter:%10.2f", price); 
		System.out.println();

		int c = 233;//use %d with an integer
		System.out.printf("%d", c); 	
		System.out.println();
		System.out.printf("%5d", c);//spaces are added so that the field width is 5, so 2 spaces and 3 letters
		System.out.println();
		System.out.printf("Spaces:%5d", c);
		
		String string = "asdfasf";//use %d with an integer
		System.out.println();
		System.out.printf("%s", string); 		
		System.out.println();
		System.out.printf("%10s", string); 			
		
		System.out.println();
		System.out.printf("%10d %10.5f", c, price); 
		System.out.println();
		//System.out.printf("%d %.2f", price, c); 	
		
		
		//so that all results can be lined up, we need all % to be lined up, I guess
	}
}
