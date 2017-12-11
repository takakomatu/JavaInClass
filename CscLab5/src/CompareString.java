
public class CompareString {
	public static void main(String[] args) {
		
		String string1 = "ab";
		String string2 = "cd";
		
		if(string1.compareTo(string2)==0) {
			System.out.println("string1 and string2 are equal");
		}		
		
		if(string1.compareTo(string2)<0) {
			System.out.println("string1 comes before string2 in the directory");			
		}		
		
		if(string1.compareTo(string2)>0) {
			System.out.println("string1 comes after string2 in the directory");	
		}
	}
}
