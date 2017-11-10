import java.util.Scanner;

public class PrelimE6_3b {//
	public static void main(String args[]) {
		Scanner a = new Scanner (System.in);
		System.out.print("Enter integers: ");

    int firstInput = a.nextInt();
	if(firstInput%2==0&&firstInput>0) System.out.println("even: " + firstInput);
	if(firstInput%2!=0&&firstInput>0) System.out.println("odd: " + firstInput);
    while (a.hasNextInt()) // or while(a.hasNextInt???)
    { 

        int input = a.nextInt();
        if (input%2==0) {
        	System.out.println("even: " + input);
        }
        
        if (input%2!=0)
        {
        	System.out.println("odd: " + input);        }
    }

		
		
		
}
}
