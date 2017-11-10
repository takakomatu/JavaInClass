import java.util.*;
public class Prelim3_5_18 {
	public static void main(String[] args) {//R5.18
		System.out.print("Enter a month: ");
		Scanner a = new Scanner(System.in);
		String b = a.next();
		System.out.print("Enter a day: ");
		int d = a.nextInt();
if(b.equals("January") && d == 1) {
System.out.print("New Year's Day");
}
if(b.equals("July") && d == 4) {
	System.out.print("Independence Day");
}

if (b.equals("November") && d == 11) {
	System.out.print("Veterans Day");
}
if(b.equals("December") && d == 25) {
	System.out.print("Christmas Day");
}
else 
	System.out.print("sadf");
}
}