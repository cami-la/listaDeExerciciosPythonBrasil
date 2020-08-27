//Make a program that asks a value and shows on the screen if the value is positive or negative.
import java.util.Scanner;

class EstruturaDeDecisaoExercise002 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter the number: ");
    int number = scan.nextInt();

    if (number >= 0) {
      System.out.println("This number is positive!");
    } else {
      System.out.println("This number is negative!");
    }
    
    }


}
