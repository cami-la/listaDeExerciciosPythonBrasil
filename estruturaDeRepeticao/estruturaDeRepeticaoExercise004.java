//Assuming that the population of country A is of the order of 80,000 inhabitants with an annual growth rate of 3% and that the population of B is 200,000 inhabitants with a growth rate of 1.5%. Make a program that calculates and writes the number of years needed for the population of country A to exceed or equal the population of country B, while maintaining growth rates.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise004 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    double inhabitantsA = 80000;
    double rateA = (1+0.03);
    double inhabitantsB = 200000;
    double rateB = (1+0.015);
    double count = 0;

    do {
      count += 1;
      inhabitantsA *= rateA;
      inhabitantsB *= rateB;
    } while (inhabitantsA < inhabitantsB);

    System.out.println("inhabitantsA = " + inhabitantsA);
    System.out.println("inhabitantsB = " + inhabitantsB);
    System.out.println("The inhabitantsA is equal or bigger than inhabitantsB in " + count + " years.");
  }
}
