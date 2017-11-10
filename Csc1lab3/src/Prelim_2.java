
public class Prelim_2 {
	public static void main(String args[]) {
		char grade='A';
String explanation;
	switch(grade)  // evaluate the expression in the ()'s ... then find the first case below that is equal ...
	{
	  case 'A':
	    explanation = " Excellent ";
	    break;
	  case 'B':
	    explanation= " Good ";
	    break;
	  case 'C':
	explanation= " Average ";
	    break;
	  case 'D':
	    explanation = " Poor ";
	    break;
	  case 'F':
	    explanation = " Failing ";
	    break;
	  default:
	    explanation = " Invalid "
	;
	}
	System.out.println(grade + " means " + explanation);
}
}