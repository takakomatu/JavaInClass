
public class ForLoop {
	public static void main(String[] args) {

		for (int counter = 1; counter <= 10; counter++){
			int x =0;
			System.out.println(counter);
		}
	//System.out.print(counter); we cant have counter outside the loop. To solve this,
		
		
		
		//define counter outside the loop
		int counter1;
		for (counter1 = 1; counter1 <= 10; counter1++){
			int x =0;
			System.out.print(counter1);
		}
	System.out.println(counter1); 
	}
}
