/* Write a method reverse that reverses the sequence of elements in an
array. For example, if reverse is called with an array containing

           1   4   9   16   9   7   4   9   11

then the array is changed to

           11   9   4   7   9   16   9   4   1 */
public class Lab5_E7_6 {    
	    public int[] reverse() {
		int[] a = { 2, 3, 5, 7, 11 }; 
			int i = 0;
			while(i<a.length/2) {
				int temp =a[a.length-i-1];
				a[a.length-i-1]=a[i];
				a[i]=temp;
				System.out.println(a[i]);
				i++;
			}	
			return a;
	    }
}

