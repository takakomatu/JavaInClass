import java.util.*;
public class PrelimE6_3a{
	public static void main(String args[])//????
	{
		Scanner a = new Scanner (System.in);
		System.out.print("Enter integers (This program calculates the largest and smallest input):");

    int firstInput = a.nextInt();
    int largest = firstInput;
    int smallest = firstInput;
    while (a.hasNextInt())
    { 
        int input = a.nextInt();
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
    System.out.println("Smallest: " + smallest);
    /*		Scanner a = new Scanner (System.in);
		System.out.print("Enter integers (This program calculates the largest and smallest input):");

    int firstInput = a.nextInt();
    int largest = firstInput;
    int smallest = firstInput;
    while (firstInput > 0)
    { 
    	firstInput = a.nextInt();
        if (firstInput > largest)
        {
            largest = firstInput;
        }
        if (firstInput < smallest)
        {
            smallest = firstInput;
        }
    }
    System.out.println("Smallest: " + smallest);
    System.out.println("Largest: " + largest);
		
	/*    Scanner a = new Scanner (System.in);
	    System.out.println("Enter inputs (This program calculates the largest and smallest input):");

	    int firstInput = a.nextInt();
	    int largest = firstInput;
	    int smallest = firstInput;
	    while (a.hasNextInt())
	    { 
	        int input = a.nextInt();
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
		/*int largest = a.nextInt();
int smallest = largest;
while (a.hasNextInt()) {
    int input = a.nextInt();
    if (input > largest) {
        largest = input;
    }
    if (input < smallest) {
        smallest = input;
    }
}*/
		
		/*int largest = a.nextInt();
int smallest = largest;
while (a.hasNextInt()) {
    int input = a.nextInt();
    largest = Math.max(largest, input);
    smallest = Math.min(smallest, input);
}*/
	    }
	}

