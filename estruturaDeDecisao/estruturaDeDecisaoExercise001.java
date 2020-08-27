//Make a program that asks for two numbers and prints the biggest ones. 
import java.util.Scanner;

class EstruturaDeDecisaoExercise001 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println();
    System.out.print("Enter the first number: ");
    int number1 = scan.nextInt();

    System.out.print("Enter the second number: ");
    int number2 = scan.nextInt();

    if (number1 > number2) {
      System.out.println("The first number " + number1 + " is bigger than second number " + number2);
    } else if (number1 == number2) {
      System.out.println("The first number " + number1 + " and second number " + number2 + " are equal.");
    } else {
      System.out.println("The second number " + number2 + " is bigger than first number " + number1);
    } 
  }
}
