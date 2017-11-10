import java.util.*;
public class JankenGame {
	public static void main(String[] args) {
		System.out.print("Enter rock scissors, or papers.");
		Scanner a = new Scanner(System.in);
			String b = a.next();
			int c=1;  //with int c=1; inside if statements
			if(b.equals("rock")) {     
				 c = 1;
			}
			if(b.equals("scissors")) {     
				 c = 1;
			}			
			if(b.equals("papers")) {     
				 c = 2;
			}
			Random d = new Random();
			int e = d.nextInt(3);
			if(c==e) {     
				System.out.print("draw");
			}	
			else if(c==(e-1)) {     
				System.out.print("you lost.");
			}			
			else {		System.out.print("You won.");
			}
	}
}
