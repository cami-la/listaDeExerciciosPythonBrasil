//Make a program that asks how much you earn per hour and the number of hours worked in the month. Calculate and show your total salary in that month.  
import java.util.Scanner;

class EstruturaSequencialExercise008 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("How much do you earn per hour? R$");
    double salaryPerHour = scan.nextDouble();

    System.out.print("How many hours do you work per month? ");
    double hourPerMonth = scan.nextDouble();

    double salaryPerMonth = hourPerMonth*salaryPerHour;

    System.out.println("The salay per month is " + salaryPerMonth);
  }
}
