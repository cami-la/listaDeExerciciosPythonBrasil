//usei herança do exercício 13
import site.camila.exerciciospythonbrasil.exerciciosclasses.exercise013.Employee;

public class Employee2 extends Employee {

	public Employee2(String name, double salary) {
		super(name, salary);
	}
	
	public void increaseSalary(double percentageIncrease) {
		this.setSalary(this.getSalary() * (1 + (percentageIncrease/100)));
	}

}
