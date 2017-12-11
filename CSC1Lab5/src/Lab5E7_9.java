/*Write a class DataSet that stores a number of values of type double. Provide a constructor 
  public DataSet(int maximumNumberOfValues) and a method public void add(double value)
that adds a value,  Provide methods to compute the sum, average, maximum, and minimum value. 
*/
public class Lab5E7_9 {
		private int max;
		private double value;
		private double sum;
		private int current;
		private double[] data;
		
		public Lab5E7_9(int maximumNumberOfValues) {
			max = maximumNumberOfValues;
			value =0;
			current = 0;
			data = new double[1000];
		}
		
		public void add(double value) {
			data[current]=value;			
			current++;
		}
		
		public double sum(){				
			sum = 0;				
			for(int i = 0; i<current; i++) {
				sum += data[i]; 
			}
			return sum;
		}
		
		/*public double average() {
			int counter = 0;
			while(counter < ) {
				
				counter++;
			}
			if(counter == 0) {
				return 0;
			}
			return sum/counter;
		}
		
		public double maximum() {
			return .1;
		}
		
		public double min() {
			return .1;
		}*/
		
		public static void main(String args[]) {
			Lab5E7_9 a = new Lab5E7_9(50);
			a.add(1);
			a.add(2);
			a.add(3);
			a.add(4);
			a.add(5);
			System.out.println(a.sum());
			System.out.println(a.sum());
		}
/*		private double sum;
		private int count;
		private int largest;
		private int smallest;
		
		public DataSet(int maximumNumberOfValues){
			sum = 0;
			count = 0;
			largest = 0;
			smallest = 0;
		}
	*/
		/*
		public void add (int x) {
			sum = sum + x;
		}
		public double getAverage(){
			if (count == 0){
				return 0;
			}
			else{
				return sum / count;
			}
		}

		public int getSum(){
			return (int)sum;
		}
		public int getLargest(){
			return largest;
		}

		public int getSmallest(){
			return smallest;
		}*/
	}

