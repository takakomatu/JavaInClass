/*
Write programs with loops that compute The sum of all squares between 1 and 100 (inclusive). 
*/

public class PrelimE6_2_b{
	public static void main(String[] args) {
		int i=1;
		int sum = 0;
		while(i<=100) 
		{
		sum = sum + i*i;
		i = i+1;			
		}
	}
}
