import java.util.Scanner;

public class Prelim3_2 {
	public static void main(String[] args) {
		System.out.print("enter integer: ");
		Scanner a = new Scanner(System.in);
		int i = a.nextInt();
		switch (i){
		  case 3:
			    System.out.println("Wow!");
		  case 9:
		    System.out.println("Hello");
		    System.out.println("World");
		    break;
		    
		  case 1:
		  case 2:
		    System.out.println("Low balled");
		    break;
		  case 7:
		    System.out.println("Lucky You!");
		    break;
		default:
		    System.out.println("Please be");
			System.out.println("Carefull!");
		}
	}
}
