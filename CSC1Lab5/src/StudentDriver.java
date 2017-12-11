
public class StudentDriver {
	public static void main(String[] args) {
		Student student = new Student();
		student.getAverage();
		Student[] a = new Student[10];
		int i = 0;
		while(i<10) {
			student=a[i];
			i++;
		}
		System.out.print(a[7].getAverage());
	}
}
