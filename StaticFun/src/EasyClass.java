
public class EasyClass {

	private int nonStatic;
	private static int thisIsStatic;
	
	public EasyClass(int initVal)
	{
		nonStatic = initVal;
		thisIsStatic = initVal;
	}
	
	public EasyClass()
	{
		nonStatic = 0;
	}
	
	public static void printMe()
	{
		// cannot refere non-static instance variable
		//System.out.println(nonStatic);
		System.out.println(thisIsStatic);
	}
	
	public int getNonStatic()
	{
		return nonStatic;		
	}
	
	public void setNonStatic(int newValue)
	{
		nonStatic = newValue;
	}
	
	public int getStatic()
	{
		return thisIsStatic;		
	}
	
	public void setStatic(int newValue)
	{
		thisIsStatic = newValue;
	}
}
