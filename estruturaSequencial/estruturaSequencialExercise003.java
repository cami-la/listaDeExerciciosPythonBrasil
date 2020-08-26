//Make a program that asks for the two numbers and prints the sum.
import java.util.Scanner;

class EstruturaSequencialExercise003 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Type the first number: ");
    int firstNumber = scan.nextInt();
    System.out.print("Type the second number: ");
    int secondNumber = scan.nextInt();

    int result = firstNumber + secondNumber;
    
    System.out.println("The sum of the "+ firstNumber + "+" + secondNumber + " = " + result);
         
  }
}
