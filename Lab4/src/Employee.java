public class Employee {
	private String name;
	private double currentSalary;
	public Employee(String name, double salary) {//this constructor's name needs to match with the class name
		this.name = name;
		currentSalary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return currentSalary;
	}
	
	public void raiseSalary(double byPercent) {
		currentSalary = currentSalary * (1+.01*byPercent);
	}
}

/*public class Employee { 

/* why (String employeeName(this is local), double currentSalary) {
		employeeName(this wants to be instance variable but gotta be local cuz rhs is local) = employeeName;
		currentSalary = currentSalary; doesnt work???*/
		
		/*
	private String employeeName;
	private double currentSalary;
	public Employee(String employeeName, double currentSalary) {//this constructor's name needs to match with the class name
		employeeName = employeeName;
		currentSalary = currentSalary;
	}
	
	public String getName() {
		return employeeName;
	}
	
	public double getSalary() {
		return currentSalary;
	}
	
	public void raiseSalary(double byPercent) {
		currentSalary = currentSalary * (1+.01*byPercent);
	}
}*/
