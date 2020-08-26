//Make a program that asks for a number and then displays the message: The number entered was [number]
import java.util.Scanner;

class EstruturaSequencialExercise002 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Type a number: ");
    int number = scan.nextInt();

    System.out.println("The number entered was: " + number);
  }
}
