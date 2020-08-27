/* Make a program for the calculation of a payroll, knowing that the discounts are from the Income Tax, which depends on the gross salary (according to the table below) and 3% for the Union and that the FGTS corresponds to 11% of the Salary Gross, but is not discounted (it is the company that deposits). The Net Salary corresponds to the Gross Salary less discounts. The program should ask the user for the value of their hour and the number of hours worked in the month.

    IR discount:
    Gross salary up to 900 (inclusive) - exempt
    Gross Salary up to 1500 (inclusive) - 5% discount
    Gross Salary up to 2500 (inclusive) - 10% discount
    Gross Salary above 2500 - 20% discount
Print the information on the screen, arranged according to the example below. In the example, the hour value is 5 and the hour amount is 220.

            Gross Salary: (5 * 220): R $ 1100.00
            (-) IR (5%): R $ 55.00
            (-) INSS (10%): R $ 110.00
            FGTS (11%): R $ 121.00
            Total discounts: R $ 165.00
            Net Salary: R $ 935.00
*/
import java.util.Scanner;

class EstruturaDeDecisaoExercise012 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Value of your hour worked: R$");
    double valueHour = scan.nextDouble();
    System.out.print("Number of hours worked in the month: ");
    double workedHours = scan.nextDouble();

    double grossSalary = workedHours * valueHour;
    double IR = 0;

    if (grossSalary <= 900) {
      IR = 0;
    } else if (grossSalary <= 1500) {
      IR = 5;
    } else if (grossSalary <= 2500) {
      IR = 10;
    } else if (grossSalary > 2500) {
      IR = 20;
    }

    double INSS = 10;
    double FGTS = 11;
    double discountIR = grossSalary * (IR/100);
    double discountINSS = grossSalary * (INSS/100);
    double discountFGTS = grossSalary * (FGTS/100);
    double totalDiscounts = discountIR + discountINSS;
    double netSalary = grossSalary - totalDiscounts;

    System.out.println();
    System.out.println("Gross Salary: " + "( " + workedHours + " * " + valueHour + " )" + " .......... R$" + grossSalary);
    System.out.println("(-) IR " + "("+ IR + "%)" + " .......................... R$" + discountIR);
    System.out.println("(-) INSS " + "("+ INSS + "%)" + " ....................... R$" + discountINSS);
    System.out.println("FGTS " + "("+ FGTS + "%)" + " ........................... R$" + discountFGTS);
    System.out.println("Total Discounts" + " ........................ R$" + discountFGTS);
    System.out.println("Net Salary" + " ............................. R$" + netSalary);
  }
}
