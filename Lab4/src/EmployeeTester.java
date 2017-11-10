
public class EmployeeTester {//y is the output 55000.00000000001
	public static void main(String[] args) {
		Employee harry = new Employee("Hacker, Harry", 50000);
		harry.raiseSalary(10);
		System.out.println(harry.getName());
		System.out.printf("%.2f", harry.getSalary());
	}
}
