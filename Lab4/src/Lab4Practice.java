
public class Lab4Practice {
    public static void main(String args[]) {

	int a = "hello".length();
	int counter =0;
	while(counter < a) {
		char b ="hello".charAt(counter);//use substring ? tips are on StringandCharacters.java
		int c = (int) b;
		if(c==123) c =97;	
		c = c + 4;		//salt1 = 4
		char d = (char) c;
		counter++;
		System.out.print(d);
	}
	
	int a1 = "hello".length();
	int counter1 =0;
	while(counter1 < a1) {
		char b ="hello".charAt(counter1);//use substring ? tips are on StringandCharacters.java
		int c = (int) b;
		if(c==123) c =97;	
		c = c + 4;		//salt1 = 4
		char d = (char) c;
		counter++;
		System.out.print(d);
	}
	}
}
