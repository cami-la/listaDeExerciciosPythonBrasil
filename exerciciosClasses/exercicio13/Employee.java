public class Employee {
	//atributes
	protected String name;
	protected double salary;
	
	//special method
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private String getName() {
		return this.name;
	}
	
	protected void setSalary(double salary) {
		this.salary = salary;
	}
	
	protected double getSalary() {
		return this.salary;
	}
	
	@Override
	public String toString() {
		return "Employee: [Name: " + this.getName() + " - Salary: R$" + this.getSalary() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee any = (Employee) obj;
			return this.name.equals(any.getName());
		} else {
			return false;
		}
	}
}
