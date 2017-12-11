// you might want to take a look at Lab4SuggestedE3_3.java
public class CircuitTester {
	public static void main(String[] args) {
		Lab4SuggestedE3_3 a = new Lab4SuggestedE3_3();
		
		System.out.println(a.getFirstSwitchState());//0
		System.out.println("Expected FirstSwitchState "+ 0);
		System.out.println(a.getSecondSwitchState());//0
		System.out.println("Expected SecondSwitchState "+ 0);
		System.out.println(a.getLampState());//0	
		System.out.println("Expected LampState "+ 0);

		a.toggleFirstSwitch();
		System.out.println(a.getFirstSwitchState());//0
		System.out.println("Expected FirstSwitchState "+ 1);
		System.out.println(a.getSecondSwitchState());//0
		System.out.println("Expected SecondSwitchState "+ 0);
		System.out.println(a.getLampState());//0
		System.out.println("Expected LampState "+ 1);

		a.toggleSecondSwitch();
		System.out.println(a.getFirstSwitchState());//0
		System.out.println("Expected FirstSwitchState "+ 1);
		System.out.println(a.getSecondSwitchState());//0
		System.out.println("Expected SecondSwitchState "+ 1);
		System.out.println(a.getLampState());//0
		System.out.println("Expected LampState "+ 0);

		a.toggleFirstSwitch();
		System.out.println(a.getFirstSwitchState());//0
		System.out.println("Expected FirstSwitchState "+ 0);
		System.out.println(a.getSecondSwitchState());//0
		System.out.println("Expected SecondSwitchState "+ 1);
		System.out.println(a.getLampState());//0
		System.out.println("Expected LampState "+ 1);


	}
}
