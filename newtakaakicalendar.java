import java.util.GregorianCalendar;
import java.util.Scanner;
public class newtakaakicalendar {
    public static void main(String[] args){

	GregorianCalendar newcalendar;
	newcalendar = new GregorianCalendar();
	int year, month, day;
	year = newcalendar.get(newcalendar.YEAR);
	month = newcalendar.get(newcalendar.MONTH);
	day = newcalendar.get(newcalendar.DAY_OF_MONTH);
	System.out.println(year + "/" + (month+1) + "/" + day);
	
	System.out.println("how many days do you add?");
	Scanner scan1 = new Scanner(System.in);
	int scan2 = scan1.nextInt();
	newcalendar.add(newcalendar.get(newcalendar.DAY_OF_MONTH), scan2);
	//y by just changing the "DAY" year and month are changed
	//other way to do this not using add method??
	year = newcalendar.get(newcalendar.YEAR);
	month = newcalendar.get(newcalendar.MONTH);
	day = newcalendar.get(newcalendar.DAY_OF_MONTH);
	System.out.println(year + "/" + (month+1) + "/" + day);
//?? error?? is this run-time error??
    }
}
