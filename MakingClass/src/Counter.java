
public class Counter {//  this java file  talks about instance variables and encapsulation??

	private int value;//private, type of varaiable (int, double, or string)
	//, name of variable(such as value) decraration of Instance Variables
	//You should declare all instance variables as private
	
	
	public void click()//The Methods of the Counter Class
	{
		value = value +1 ;//value is an instance variable
	}
	
	public void resetTo1()//public or private, something retured, method name
	{
		value =1;
	}
	
	public int getValue()
	{
		return value;
	}
	/*The return statement performs two tasks:
•Terminates the method call
•Returns a result (the return value) to the method's caller
•note that not all return statements have to return a value
•they must if the method signature says there is a return value
•they must not if the method signature has a return type of void*/
	
}
