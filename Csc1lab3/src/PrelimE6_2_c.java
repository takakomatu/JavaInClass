/*
Write programs with loops that compute  All powers of 2 from 2^0 up to 2^20. 
*/
public class PrelimE6_2_c{
	public static void main(String[] args) {
		int i=0;
	//	int sum =1;
		while(i<=20) 
		{ 
			System.out.print(i + "  ");
			Math.pow(2, i);
			i = i+1;
	/*	i = i+1;
		sum = sum * 2;*/
		}
	}
}
