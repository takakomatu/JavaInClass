import java.util.*;
public class Prelim3_6_12ThisIsChallenging {//6.12
	public static void main(String[] args) {
/*		System.out.println("rum".substring(0, 1));
		System.out.println("rum".substring(1, 2));
		System.out.println("rum".substring(2, 3));
		System.out.println("rum".substring(0, 2));
		System.out.println("rum".substring(1, 3));
		System.out.println("rum".substring(0, 3));*/
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = in.next();
		int length = 1; 
		while(length <= word.length()){
			int pos = 0; 
		while(pos <= word.length()-length)
		{
		System.out.println(word.substring(pos, pos + length));
		pos++;
		}
		length++;
		}
		
		
/*Scanner input = new Scanner(System.in);
System.out.print("Word: ");
String word = input.next();
input.close();
int length =1;
while(length <=word.length()) {
	length++;
	int pos =0;
	while(pos <= word.length()) {
		System.out.println(word.substring(pos, pos+length));
	}
		
}*/
/*		int i=1; 
while (i<s.length()) { 
for (int j=0; j+i<s.length(); ++j) { 
System.out.println( s.substring( j, j+i ) ); 
} 
++i;} 

/*System.out.print("Word: ");
Scanner a = new Scanner(System.in);
String b = a.next();
int c =b.length();
int i = 0;
while(i<=c-1) {
	i++;
	int j = 1;
	while(j<=c) {
		
	}
	
}*/
	
	
	}
}
