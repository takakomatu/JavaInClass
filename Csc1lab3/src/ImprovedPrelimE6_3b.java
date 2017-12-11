/*
 Write programs that read a sequence of integer inputs and print The number of even and odd inputs
 */

import java.util.Scanner;
public class ImprovedPrelimE6_3b {
    public static void main(String[] args) { 
		System.out.println("Enter integers"); 
    	Scanner input = new Scanner(System.in); 
    	int odd_numbers = 0; 
		int even_numbers = 0; 
		while (input.hasNextInt()) { //infinite loop
			int input_number = input.nextInt(); 
			if (input_number % 2 == 0) { 
				even_numbers++; 
			} 
			else { 
				odd_numbers++; 
			} 
		} 
		System.out.println("Odd numbers: " + odd_numbers); 
		System.out.println("Even numbers: " + even_numbers); 
    } 
}
