//Make a Program that asks for a number and inform if the number is an integer or a decimal. Tip: use a rounding function.
import java.util.Scanner;

class EstruturaDeDecisaoExercise023 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter a number: ");
    double number = scan.nextDouble();

    double numberFormated = Math.round(number);
  
    if (numberFormated == number) {
      System.out.println("This number " + number + " is a integer number!");
    } else {
      System.out.println("This number " + number + " isn't a integer number!");
    }
  }
}
