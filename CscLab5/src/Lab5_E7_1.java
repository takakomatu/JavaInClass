/*Write a program that initializes an array with ten random integers and then prints 
four lines of output, containing

•    Every element at an even index.

•    Every even element.

•    All elements in reverse order.

•    Only the first and last element.*/

import java.util.*;
public class Lab5_E7_1 {
	public static void main(String args[]) {
	
		System.out.println(7.0%4 + "\n"+ 7.0/4);

		int[] numbers = new int[10];//0 is smallest index, 9 is the largest
		int i = 0;
		Random random = new Random();

		while(i<=9) {
			numbers[i]=i;
			i++;
		}
		
		System.out.println("Every even index element:");
		int count=0;
		while(count<10) {
			if(count%2 == 0)
				System.out.println(numbers[count]);
			count++;
		}
		
		System.out.println("Every even element:");
		int count1=0;
		while(count1<=9) {
			if(numbers[count1]%2 == 0)
				System.out.println(numbers[count1]);
			count1++;
		}
	
		System.out.println("All elements in reverse order:");
		int count2=9;
		while(count2>=0) {
			System.out.println(numbers[count2]);
			count2--;
		}	
		System.out.println("All elements in reverse order:");
		
		System.out.println(numbers[0]);
		System.out.println(numbers[9]);
	}
}
