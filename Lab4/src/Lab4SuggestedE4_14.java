import java.util.Scanner;
public class Lab4SuggestedE4_14 {
	public static void main(String[]args){
		Scanner a=new Scanner(System.in);
		System.out.print("Integer between 1000 and 999999: ");
		String b=a.next();
		String second=b.substring(b.length()-3);
		String first=b.substring(0,b.length()-3);
		System.out.println(first+"," + second);
	}
}
