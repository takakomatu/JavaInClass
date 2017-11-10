
public class CounterDriver {

	public static void main(String[] args) {
		Counter tally = new Counter();
		
		tally.click();//where is Encapsulation and instance variables??
		tally.click();
		
		tally.resetTo1();
		//tally.value = 0;
		
		
		tally.click();
		tally.click();
		
		
		
		System.out.println(tally.getValue());

	}

}
