import java.util.Scanner;

public class NewGradeStatics {
	private int maxTestScore;
	private int[] scores;
	private int i;
	
	public NewGradeStatics(Scanner a) {
		maxTestScore = a.nextInt();
		scores = new int[1000];			
		i = 0;
		while(a.hasNextInt()) {
			scores[i] = a.nextInt();
			i++;
		}
	}
	
	public int findMode() {
		return 1;
	}
}
