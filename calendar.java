import java.awt.Rectangle;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class calendar {
public static void main(String[] args){
GregorianCalendar newcalendar;
newcalendar = new GregorianCalendar();
int year, month, day;
year = newcalendar.get(newcalendar.YEAR);
month = newcalendar.get(newcalendar.MONTH);
day = newcalendar.get(newcalendar.DAY_OF_MONTH);
System.out.println(year + "/" + (month+1) + "/" + day);
System.out.println(newcalendar.DAY_OF_MONTH);
System.out.println(newcalendar.MONTH);


System.out.println("how many days do you add?");
Scanner scan1 = new Scanner(System.in);
int scan2 = scan1.nextInt();
newcalendar.add(newcalendar.DAY_OF_MONTH, scan2);
newcalendar.add(newcalendar.MONTH, scan2);
newcalendar.add(newcalendar.YEAR, scan2);
year = newcalendar.get(newcalendar.YEAR);
month = newcalendar.get(newcalendar.MONTH);
day = newcalendar.get(newcalendar.DAY_OF_MONTH);
System.out.println(year + "/" + (month+1) + "/" + day);





}}