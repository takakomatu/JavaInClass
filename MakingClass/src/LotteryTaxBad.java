import java.util.Scanner;
import java.util.Random;
public class LotteryTaxBad {
	public static void main(String [] args)
	{
		Scanner k = new Scanner(System.in);
		System.out.print("What is the highest number?");
		int maxVal = k.nextInt();
		
		Random generator = new Random();
		
		int nextNumber = generator.nextInt(maxVal)+1;
		System.out.print(nextNumber + " "); //
		
		int incrementAmount = generator.nextInt(maxVal-nextNumber+1);
		nextNumber = nextNumber + incrementAmount;
		System.out.print(nextNumber + " "); //
		
		incrementAmount = generator.nextInt(maxVal-nextNumber+1);
		nextNumber = nextNumber + incrementAmount;
		System.out.println(nextNumber + " ");// 
		
		System.out.println("The lottery - a tax on those bad at math!");
	}
}
