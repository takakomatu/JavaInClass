
public class BugTester {
	public static void main(String[] args) {
		Bug bugsy = new Bug(10);
		bugsy.move();//Now the position is 11
		bugsy.turn();
		bugsy.turn();
		bugsy.move();//Now the position is 12
		bugsy.move();//Now the position is 13
		bugsy.turn();
		bugsy.move();//Now the position is 12
		System.out.println("Actual position: "+bugsy.getPosition());
		System.out.println("Expected position: 12");
		
	}
}
