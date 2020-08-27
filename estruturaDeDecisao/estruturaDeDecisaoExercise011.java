/* Tabajara Organizations decided to give their employees a salary increase and hired them to develop the program that will calculate the adjustments.
Make a program that receives an employee's salary and readjust it according to the following criteria, based on the current salary:
A) wages up to R $ 280.00 (including): 20% increase
B) wages between R $ 280.00 and R $ 700.00: increase of 15%
C) wages between R $ 700.00 and R $ 1500.00: 10% increase
D) salaries from R $ 1500.00 onwards: increase of 5% After the increase is made, inform on the screen:
E) the salary before the readjustment;
F) the percentage of increase applied;
G) the amount of the increase;
H) the new salary, after the increase.
*/
import java.util.Scanner;

class EstruturaDeDecisaoExercise011 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Type the employee salary: R$");
    double salary = scan.nextDouble();

    double percentage = 0;
        
    if (salary <= 280){
      percentage = 20;
    } else if (salary < 700) {
      percentage = 15;
    } else if (salary < 1500) {
      percentage = 10;
    } else if (salary >= 1500) {
      percentage = 5;
    }

    double newSalary = salary*((percentage/100)+1);
    double increasedSalary = newSalary - salary ;

    System.out.println("The employee salary was R$" + salary);
    System.out.println("The percentage was " + percentage + "%");
    System.out.println("The increase amount was R$" + increasedSalary);
    System.out.println("The employe new salary is R$" + newSalary);

  }

}
