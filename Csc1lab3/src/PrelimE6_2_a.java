/*
Write programs with loops that compute The sum of all even numbers between 2 and 100 (inclusive). 
*/

public class PrelimE6_2_a{
	public static void main(String[] args) {
		int i=2;
		int sum = 0;
		while(i<=100) {
			if(i%2==0)
			{sum = sum +i;
			}
			i = i + 1;
		}
			
			
	
		/*{sum = sum +i;
		i = i+2;
		}*/
		System.out.println(sum);	
		System.out.println(102*25);
	}
}
