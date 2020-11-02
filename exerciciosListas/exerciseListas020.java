/*Tabajara Organizations have decided to give an allowance to their employees in recognition of the good result achieved during the past year. For this, you hired to develop the application that will serve as a projection of how much will be spent on the payment of this allowance.

    After meetings involving the executive board, the financial board and representatives of the labor union, the following calculation method was arrived at:

    a.Each employee will receive the equivalent of 20% of his gross December salary; a.The bonus floor will be 100 reais, that is, those employees whose salary is very low, receive this minimum amount; At this time, there should be no concern for employees with less time on the job, discounts, taxes or other particulars. Your program should allow you to enter the salary for an undefined (unknown) number of salaries. A salary amount equal to 0 (zero) ends the entry. After entering all the data, the program must calculate the amount of the bonus granted to each employee, according to the rule defined above. At the end, the program must present:
    The salary of each employee, together with the amount of the bonus;
    The total number of employees processed;
    The total amount to be spent on the payment of the allowance;
    The number of employees who will receive the minimum amount of 100 reais;
    The highest amount paid as an allowance; The screen below is an example of running the program, for illustrative purposes only. Values ​​may change with each program run.

Projection of Expenses with Allowance
============================
 
Salary: 1000
Salary: 300
Salary: 500
Salary: 100
Salary: 4500
Salary: 0
 
Salary - Allowance
R $ 1000.00 - R $ 200.00
R $ 300.00 - R $ 100.00
R $ 500.00 - R $ 100.00
R $ 100.00 - R $ 100.00
R $ 4500.00 - R $ 900.00
 
5 employees were processed
Total expenses with allowances: R $ 1400.00
Minimum amount paid to 3 employees
Highest amount of bonus paid: R $ 900.00
*/
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

class ExerciseListas020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Criando uma LinkedList já que não vamos precisar do método get.
		List<Double> fees = new LinkedList<>();
		
		double percBonus = 20;
		double bonusMin = 100.0;
		System.out.println("Bonus Spending Projection");
		System.out.println("=========================\n");
		//capturando os salarios e colocando na LinkedList.
		while(true) {
			System.out.print("Salary: ");
			double salary = scan.nextDouble();	
			if (salary == 0) {
				break;
			} else if (salary < 0) {
				System.out.println("Invalid Salary!");
				continue;
			} else {
				fees.add(salary);
			}			
		}
		//System.out.println(fees);
		/*Criando um map para ligar os salarios com seus respectivos bônus, respeitando a regra de no mínimo R$100 para salários
		abaixo de R$500.
		Usamos uma LinkedHashMap pois a ordem de inserção importa, como demostrado na impressão do exemplo, logo não precisamos
		ordenar.
		*/		
		Map<Double, Double> salaryToBonus = new LinkedHashMap<>();
		for (Double valueSalary : fees) {
			if (!salaryToBonus.containsKey(valueSalary)) {
				if (valueSalary > 500) {
					salaryToBonus.put(valueSalary, (valueSalary*percBonus)/100);
				} else {
					salaryToBonus.put(valueSalary, bonusMin);
				}
			}
		}
		//System.out.println(salaryToBonus);
		
		/*Como dito acima, na impressão do exemplo não foi preciso ordenar nem a chave nem o valor. 
		 Ele mostra que foi impresso pela ordem de inserção, entao vamos fazer um for com Map.Entry para imprimir 
		 os valores do map (salaryToBonus) e manipular as chaves e valores de acordo com o que se pede.
		 */
		double sumTotalFees = 0; int countMinValue = 0; double biggerValueBonus = Integer.MIN_VALUE;
		System.out.println("\nSalary        - Abono");
		for(Map.Entry<Double, Double> entry : salaryToBonus.entrySet()) {
			sumTotalFees += entry.getValue();
			if (entry.getValue() == bonusMin) {
				countMinValue++;
			}
			if (biggerValueBonus < entry.getValue()) {
				biggerValueBonus = entry.getValue();
			}
			System.out.printf(Locale.US, "R$ %10.2f - R$ %10.2f\n", entry.getKey(), entry.getValue());
		}
		System.out.printf("\nWas computed %d employee\n", fees.size());
		System.out.printf(Locale.US, "Total bonus spend: R$ %.2f\n", sumTotalFees);
		System.out.printf("Minimum amount paid to %d employees\n",countMinValue);
		System.out.printf(Locale.US,"Highest amount of bonus paid: R$ %.2f\n", biggerValueBonus);
	}
}
