
public class JavaTable {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++)
		{
		   for (int j = 0; j < 4; j++)
		   {
		      System.out.print(i + j);
		   }
		   System.out.println();
		} 
		
		for (int i = 1; i <= 3; i++)
		{
		   for (int j = 1; j <= 4; j++)
		   {
		      System.out.print("[]");
		   }
		   System.out.println();
		}
	}
}
