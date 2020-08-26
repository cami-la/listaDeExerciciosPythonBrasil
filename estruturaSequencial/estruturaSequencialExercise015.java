/* Make a Program that asks how much you earn per hour and the number of hours worked in the month. Calculate and show the total of your salary in that month, knowing that 11% are deducted for Income Tax, 8% for INSS and 5% for the union, make a program that gives us:
gross salary.
how much you paid INSS.
how much you paid the union.
the net salary.
calculate the discounts and net salary, according to the table below:
+ Gross Salary: R $
- IR (11%): R $
- INSS (8%): ​​R $
- Union (5%): R $
= Net Salary: R $
Note: Gross Salary - Discounts = Net Salary.
*/
import java.util.Scanner;

class EstruturaSequencialExercise015 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("How much do you earn per hour? R$");
    double salaryPerHour = scan.nextDouble();

    System.out.print("How many hours do you work per month? ");
    double hourPerMonth = scan.nextDouble();

    double grossSalary = hourPerMonth*salaryPerHour;
    double IR = grossSalary * 0.11;
    double INSS = grossSalary * 0.08;
    double union = grossSalary * 0.05;
    double discounts = IR+INSS+union;
    double netSalary = grossSalary-discounts;

    System.out.println("+ Gross Salary : R$" + grossSalary);
    System.out.println("- IR (11%): R$" + IR);
    System.out.println("- INSS (8%):  R$" + INSS);
    System.out.println("- Union (5%):  R$" + union);
    System.out.println("= Net Salary : R$" + netSalary);

  }
}

