import java.util.*;

public class GradeStatistics {
	private int[] data;
	private int currentSize;
	private int[] counter;//oj
	
	public GradeStatistics(Scanner a) {
		data = new int[10000];
		int firstValue = a.nextInt();
		int i = 0;
		while(a.hasNextInt()) {
			data[i] = a.nextInt();
			i++;
		}
		currentSize = i;
		counter = new int[firstValue+1];//oj
		System.out.println(data.length);
		System.out.println(counter.length);
	}
	
	public void showDistribution() {
		for (int i=0; i < currentSize; i++) 
		{
			counter[data[i]] = counter[data[i]]+1;
		}
		
		for (int k=0; k < counter.length; k++) 
		{
			System.out.printf("[%3d]", k);
			for(int j = 0; j < counter[k]; j++)
				System.out.print("*");
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
		
		
		return largest;
	}
}
