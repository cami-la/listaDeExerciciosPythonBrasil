// Make a Program that asks for a whole number and determine if it is even or odd. Tip: use the module operator (rest of the division).
import java.util.Scanner;

class EstruturaDeDecisaoExercise022 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter a number: ");
    int number = scan.nextInt();

    if (number % 2 == 0) {
      System.out.println("The number " + number + " is even.");
    } else {
      System.out.println("The number " + number + " is odd.");
    }
  }
}
