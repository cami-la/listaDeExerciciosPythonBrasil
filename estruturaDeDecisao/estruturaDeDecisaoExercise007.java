//Make a program that reads three numbers and shows the bigger and smaller one.
import java.util.Scanner;

class EstruturaDeDecisaoExercise007 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter the first number: ");
    int number1 = scan.nextInt();

    System.out.print("Enter the second number: ");
    int number2 = scan.nextInt();

    System.out.print("Enter the thirth number: ");
    int number3 = scan.nextInt();

    if (number1 >= number2 && number1 >= number3) {
      System.out.println("The first number " + number1 + " is bigger");
    } else if (number2 >= number1 && number2 >= number3) {
      System.out.println("The second number " + number2 + " is bigger");
    } else if (number3 >= number1 && number3 >= number2) {
      System.out.println("The thirth number " + number3 + " is bigger");
    }

    if (number1 <= number2 && number1 <= number3) {
      System.out.println("The first number " + number1 + " is smaller");
    } else if (number2 <= number1 && number2 <= number3) {
      System.out.println("The second number " + number2 + " is smaller");
    } else if (number3 <= number1 && number3 <= number2) {
      System.out.println("The thirth number " + number3 + " is smaller");
    }
  }
}
