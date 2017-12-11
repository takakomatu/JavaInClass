/*	Write nested loops that make the following pattern of brackets:
		[][][][]
		[][][][]
		[][][][]
*/
public class SimpleTable3 {
	public static void main(String args[]) {
		for(int i=0; i<=2;i++) {
			for(int j=0; j<=3;j++) {
				System.out.print("[]");
			}
			System.out.println("[]");
		}
	}
}
