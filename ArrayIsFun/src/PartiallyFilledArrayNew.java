
public class PartiallyFilledArrayNew {

	private int[] data;
	private int currentSize;
	
	public PartiallyFilledArrayNew()
	{
		data = new int[10000];
		currentSize = 0;
	}
	
	public void addElement(int newElement)
	{
		if (currentSize < data.length)
		{
			data[currentSize] = newElement;
			currentSize++;
		}
		else
		{
			System.out.print("Uh, oh . no room left in the array!");
		}
	}
	
	public void print()
	{
		for (int index=0; index<currentSize; index++ )
		{
			System.out.print(data[index] + " ");
		}
		System.out.println();
	}
	
	public int findMinIndexFrom(int startIndex)
	{
		int minIndex = startIndex;
		for(int searchIndex=startIndex+1; searchIndex<currentSize; searchIndex++)
		{
			if (data[searchIndex] < data[minIndex])
				minIndex = searchIndex;
		}
		return minIndex;
	}
	
	public void swap(int pos1, int pos2)
	{
		int temp = data[pos1];
		data[pos1] = data[pos2];
		data[pos2] = temp;
	}
	public void selectionSort()
	{
		for (int currPos = 0; currPos< currentSize; currPos++)
		{
			// find the minimum piece
			int minIndex = findMinIndexFrom(currPos);
						
			// swap minimum piece into currPos
			swap(minIndex, currPos);
		}
	}
	
	public void bubbleSort()
	{
		boolean swapMade=false;
		
		do
		{
			swapMade = false;
			for (int index =0; index< currentSize-1; index++)		
			{
				if (data[index] > data[index+1])
				{
					swap(index, index+1);
					swapMade = true;
				}
			}
		}
		
		while(swapMade);
	}
	
	public int linearSearch(int valToSearchFor)
	{
		boolean found = false;
		
		int index =0;
		
		while(!found && index < currentSize)
		{
			if (data[index] == valToSearchFor)
				found = true;
			else
				index++;
		}
		
		System.out.println("Examined " + index + " elements !");
		
		if (found)
			return index;
		else
			return -1;
	}
	
	public int binarySearch(int valToSearchFor)
	{
		int leftIndex = 0;
		int rightIndex = currentSize-1;
		int answerIndex=-1;
		int elementsExamined = 0;
		
		boolean found = false;
		while(!found && (leftIndex <= rightIndex ))
		{
			int middleIndex = (leftIndex + rightIndex)/2;
			
			elementsExamined++;
			
			if (valToSearchFor == data[middleIndex])
			{
				answerIndex = middleIndex;
				found = true;
			}
			else if (valToSearchFor < data[middleIndex])
			{
				rightIndex = middleIndex-1;
			}
			else // must be greater !!!
			{
				leftIndex = middleIndex+1;
			}
		}
		System.out.println("Examined " + elementsExamined + " elements !");
		
		return answerIndex;
	}
}
