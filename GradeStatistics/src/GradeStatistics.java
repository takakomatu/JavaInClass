import java.util.*;
public class GradeStatistics {
	private int[] counter;
	private int[] data;
	private int currentSize;
	
	public GradeStatistics(Scanner a) {
		data = new int[1000];
		int firstValue = a.nextInt();
		int i = 0;
		while(a.hasNextInt()) {
			data[i] = a.nextInt();
			i++;
		}
		currentSize = i;
		counter = new int[firstValue+1];

	}
	
	public void showDistribution() {
		for(int i=0; i<currentSize; i++) {
			counter[data[i]] = counter[data[i]]+1;
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.printf("%3d", i);
			for(int k=0; k<counter[i]; k++) {
				System.out.println("*");
			}
			System.out.println();			
		}
	}
	
	public int findMode() {
		int largest = 0;
		for (int i=1; i < counter.length; i++) 
		{
			if(counter[i]>=counter[largest])
				largest = i;
		}
		
		return largest;	}
}
