/*Make a program that reads 2 numbers and then ask the user which operation he wants to perform. The result of the operation must be accompanied by a sentence that says whether the number is:
A) even or odd;
B) positive or negative;
C) integer or decimal.
*/
import java.util.Scanner;

class EstruturaDeDecisaoExercise024 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter the first number: ");
    double number1 = scan.nextDouble();
    System.out.print("Enter the second number: ");
    double number2 = scan.nextDouble();

    System.out.println();
    System.out.println("--------------------");
    System.out.println("CHOICE THE OPERATION");
    System.out.println("  1 - DIVISON ");
    System.out.println("  2 - SUBTRACTION ");
    System.out.println("  3 - MULTIPICATION ");
    System.out.println("  4 - SUM ");
    System.out.println("--------------------");
    System.out.println("Choice: [1 or 2 or 3 or 4]: ");

    int choice = scan.nextInt();
    double result = 0;

    boolean valid = true;

    switch(choice) {
      case 1: result = number1/number2; break;
      case 2: result = number1 - number2; break;
      case 3: result = number1*number2; break;
      case 4: result = number1 + number2; break;
      default: System.out.println("Invalid option!"); valid = false;
    }

    if (valid){
      if (result % 2 == 0) {
      System.out.println("This result " + result + " is even.");
    } else {
        System.out.println("This result " + result + " is odd.");
    }

    if (result >= 0) {
      System.out.println("This result " + result + " is positive.");
    } else {
      System.out.println("This result " + result + " is negative.");
    }

    if (result == Math.round(result)) {
      System.out.println("This result " + result + " is a integer number.");
    } else {
      System.out.println("This result " + result + " is decimal number.");
    }
  }
    
  }
}
