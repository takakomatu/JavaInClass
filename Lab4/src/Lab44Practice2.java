
public class Lab44Practice2 {
    public static void main(String args[]) {

	int a = "hello".length();
	int counter =0;
	while(counter < a) {
		char b ="hello".charAt(counter);//use substring ? tips are on StringandCharacters.java
		int c = (int) b;
		while(c>=123) { 
			c =c-26;	//when c = 123, c should be 97
			c = c + 4;	
		}
		c = c + 4;		//salt1 = 4
		while(c>=123) { 
			c =c-26;	//when c = 123, c should be 97
			c = c + 4;	
		}
		char d = (char) c;
		counter++;
		System.out.print(d);
	}
	
	
	}
}
