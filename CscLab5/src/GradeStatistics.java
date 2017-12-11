import java.util.*;

public class GradeStatistics {
	private int[] data;
	private int currentSize;
	private Scanner a1;
	public GradeStatistics(Scanner a) {
		data = new int[10000];
		data = a;
		int searchedValue = 100;
		int pos = 0;
		boolean found = false;
		while (pos < values.length && !found)
		{
		   if (values[pos] == searchedValue) 
		      found = true; 
		   else 
		      pos++; 
		}
		if (found) 
		   System.out.println("Found at position: " + pos); 
		else 
		   System.out.println("Not found");
	}
	public void showDistribution() {
		
	}
	public int findMode() {
		return 1;
	}
}
