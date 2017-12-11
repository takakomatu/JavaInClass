import java.util.Random;

public class PIEstimator {

	public static void main(String[] args) {
		
		int totalDarts=10000000;
		int totalInCircle=0;
		
		Random gen = new Random();
		
		for(int dart = 0; dart < totalDarts; dart ++)
		{
			double x = 2 * gen.nextDouble() - 1;//0 <= gen.nextDouble() < 1
			double y = 2 * gen.nextDouble() - 1;//-1<= x, y < 1
			
			if (x*x + y*y <=1)
				totalInCircle++;
		}
		
		double piGuess = 4.0 * totalInCircle / totalDarts;
		System.out.println("PI is (roughly) " + piGuess);

	}

}
