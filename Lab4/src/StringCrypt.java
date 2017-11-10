
public class StringCrypt {//a=97 z=122
	private int salt1;
	private String encrypted;
	public StringCrypt(int salt){
		salt1 = salt;
	}
	public String encrypt(String unencrypt) {
		String answer = "";
		int a = unencrypt.length();
		int counter =0;
		while(counter < a) {
			char b =unencrypt.charAt(counter);
			int c = (int) b;
			char d = (char)((salt1 + c -'a')%26 + 'a');
			answer = answer + d;
			counter++;
			}	
		return answer;
	}	
	
	public String decrypt(String decrypt) {
		String answer = "";
		int a = decrypt.length();
		int counter =0;
		while(counter < a) {
			char b =decrypt.charAt(counter);
			int c = (int) b;
			char d = (char)((c -salt1 - 'z')%26 + 'z');
			answer = answer + d;
			counter++;
			}	
		return answer;
	}
		

}
