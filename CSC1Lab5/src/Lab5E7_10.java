/* Write array methods that carry out the following tasks for an array of integers by completing the ArrayMethods class below. 
   For each method, provide a test program. 
 	public class ArrayMethods {   
		private int[] values;   
		public ArrayMethods(int[] initialValues) { 
			values = initialValues; 
		}   
		public void swapFirstAndLast() {

		}   
		public void shiftRight() {
			
		}
	} 
	a. Swap the first and last elements in the array. 
	b. Shift all elements to the right by one and move the last element into the first  position. For example, 1 4 9 16 25 
	would be transformed into 25 1 4 9 16. 
	c. Replace all even elements with 0. 
	d. Replace each element except the first and last by the larger of its two neighbors. 
	e. Remove the middle element if the array length is odd, or the middle two elements if the length is even. 
	f. Move all even elements to the front, otherwise preserving the order of the elements. 
	g. Return the second-largest element in the array. 
	h. Return true if the array is currently sorted in increasing order. 
	i. Return true if the array contains two adjacent duplicate elements. 
	j. Return true if the array contains duplicate elements (which need not be adjacent). 
	*/
public class Lab5E7_10 {
	public class ArrayMethods {   
		private int[] values;   
		
		public ArrayMethods(int[] initialValues) { 
			values = initialValues; 
		}   
		
		public void swapFirstAndLast() {
			int temp = values[0];
			values[0] = values[values.length-1];
			values[values.length-1] = temp;
		}   
		
		public void shiftRight() {
			int temp = values[values.length-1];
			for(int i = 0; i < values.length; i++) {
				values[i+1]=values[i];
			}
			values[0]= temp;
		}
		public void replaceEvenTo0() {
			for(int i=0; i<values.length; i++) {
				if(values[i]%2==0) {
					values[i]=0;
				}
			}
		}
		public void replaceByLarger() {//d. Replace each element except the first and last by the larger of its two neighbors. 
			int[] copy = new int[values.length];
			for(int i=1; i<values.length-1; i++) {//how to save????
				if(values[i-1]>values[i+1]) {
					copy[i]=values[i-1];
				}				
				else if(values[i-1]<values[i+1]) {
					values[i]=values[i+1];
				}			
				//values = copy;
			}
		}
		//	e. Remove the middle element if the array length is odd, or the middle two elements if the length is even. 
		public void removeMiddle() {
			if(values.length%2==1) {
				values[(values.length+1)/2] //out of a test
			}			
			else if(values.length%2==0) {
				
			}
			
		}
		//	f. Move all even elements to the front, otherwise preserving the order of the elements. 
		public void moveEven() {
			
		}
		//g. Return the second-largest element in the array. 
		public int returnSecondLargest() {
			
			return 1;
		}
		//	h. Return true if the array is currently sorted in increasing order. 
		public boolean ifIncreasingOrder() {
			boolean ifIncreasingOrder = true;
			int i = 0;
			while(ifIncreasingOrder&&i<values.length-1) {
				if(values[i]>values[i+1]) {
					ifIncreasingOrder = false;
				}
				i++;
			}
			return true;
		}
		//	i. Return true if the array contains two adjacent duplicate elements. 
		public boolean ifHasAdjacentDuplicate() {
			boolean found = false;
			int i =0;
			while(!found&&i<values.length-1) {
				if(values[i]==values[i+1]) {
					found = true;
				}
				i++;
			}
			return found;
		}
		//	j. Return true if the array contains duplicate elements (which need not be adjacent). 
		public boolean ifHasDuplicate() {
			boolean found = false;
			int i = 0;
			int j = 0;
			while(!found&&i<values.length) {
				while(!found&&i<values.length) {
					if(values[i]==values[j]) {
						found = true;
					}
					j++;
				}
				i++;
			}
			return found;
		}
	} 
}
