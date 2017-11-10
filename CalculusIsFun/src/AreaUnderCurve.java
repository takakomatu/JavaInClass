import java.util.Scanner;

public class AreaUnderCurve {

	public static double f(double xValue)
	{
		return Math.exp(-xValue * xValue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("Please enter a and b: ");
		double a = kbd.nextDouble();
		double b = kbd.nextDouble();
		
		System.out.print("Please enter deltaX: ");
		double deltaX = kbd.nextDouble();
		
		double areaUnderCurve=0;
		
		for (double xcurr=a; xcurr<b; xcurr+=deltaX)
		{
			double rectArea = f(xcurr)* deltaX;
			areaUnderCurve += rectArea;
		}
		
		System.out.println("Area under curve is " + areaUnderCurve);
	}

		
		
		
		
		
		
}
