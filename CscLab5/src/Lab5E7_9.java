/*Write a class DataSet that stores a number of values of type double. Provide a constructor 
  public DataSet(int maximumNumberOfValues) and a method public void add(double value)
that adds a value, provided there is still room. Provide methods to compute the sum, average, maximum, and minimum value. 
*/
public class Lab5E7_9 {
	public class DataSet
	{

		private double sum;

		private int count;

		private int largest;

		private int smallest;





		public DataSet()

		{

			sum = 0;

			count = 0;

			largest = 0;

			smallest = 0;

		}



		public void addValue (int x)

		{

			sum = sum + x;



			if (count == 0 || sum < x)

			{

				largest = (x += (int)sum) + x;

			}

			else if (count == 0 || sum > x)

			{

				smallest = x;

			}



			count ++;



		}



		public double getAverage()

		{

			if (count == 0)

			{

				return 0;

			}



			else

			{

				return sum / count;

			}

		}



		public int getSum()

		{

			return (int)sum;

		}



		public int getLargest()

		{

			return largest;

		}



		public int getSmallest()

		{

			return smallest;

		}

	}
}
