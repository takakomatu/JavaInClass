import java.util.*; //this is just a draft
public class PrelimE6_3{
	public static void main(String args[])
	{	
		Scanner a = new Scanner (System.in);
		System.out.print("Enter integers: ");
		int b = a.nextInt();

 /*   int firstInput = a.nextInt();
    int odd = firstInput;
    int even = firstInput;
    while (a.hasNextInt())
    { 
    	if(firstInput %2 == 0) {System.out.print(" even: ");
        System.out.println(" " + firstInput);}
    	
    	if(firstInput %2 != 0) {System.out.print(" odd: ");
        System.out.println(" " + firstInput);}
    	
    	
        int input = a.nextInt();
        if (input %2 == 0)
        {
            even = input;
            System.out.print(" even: ");
            System.out.println(" " + even);
        }
        if (input %2 != 0)
        {
            odd = input;
            System.out.print(" odd: ");
            System.out.println(" " + odd);
        }
    }
		
	/*    Scanner a = new Scanner (System.in);
	    System.out.println("Enter inputs (This program calculates the largest and smallest input):");

	    double firstInput = a.nextDouble();
	    double largest = firstInput;
	    double smallest = firstInput;
	    while (a.hasNextDouble())
	    { 
	        double input = a.nextDouble();
	        if (input > largest)
	        {
	            largest = input;
	        }
	        if (input < smallest)
	        {
	            smallest = input;
	        }
	    }

	    System.out.println("Largest: " + largest);
	    System.out.println("Smallest: " + smallest);*/
		/*double largest = a.nextDouble();
double smallest = largest;
while (a.hasNextDouble()) {
    double input = a.nextDouble();
    if (input > largest) {
        largest = input;
    }
    if (input < smallest) {
        smallest = input;
    }
}*/
		
		/*double largest = a.nextDouble();
double smallest = largest;
while (a.hasNextDouble()) {
    double input = a.nextDouble();
    largest = Math.max(largest, input);
    smallest = Math.min(smallest, input);
}*/
	    }
	}

