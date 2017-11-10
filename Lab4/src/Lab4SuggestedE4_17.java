import java.util.*;
public class Lab4SuggestedE4_17 {
	public static void main(String[] args) {
		System.out.print("Enter the first time: ");
		Scanner a = new Scanner(System.in);
		int first = a.nextInt();//0900
		System.out.print("Enter the second time: ");
		int second = a.nextInt();// 1930
		if(second>=first) {
			int hour = (second -first)/100;//1030/100=10
			int min = (second -first)%100;//30
			System.out.print(hour + " hours ");
			System.out.print(min + " minutes");
		}

		else {
			int b = (2360 - first);
			b = b + second;
			int hour = b/100;
			int min = b%100;
			if(min==60) {
				hour = hour + 1;
				min = 0;
			}
			System.out.print(hour + " hours ");
			System.out.print(min + " minutes");
		}
	}
}
