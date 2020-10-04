// Make a program that reads a vetor of 5 integers numbers and display.
import java.util.Scanner;

class ExerciseListas001 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    double[] numbers = new double[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter the position " + (i+1 ) + "o. of numbers vetor." );
      numbers[i] = scan.nextDouble();
    }
    
    for (int i = 0; i < 5; i++) {
      if (i == 4) {
         System.out.print(numbers[i]);
      } else {
        System.out.print(numbers[i]+ ", ");
      }
    }
  }
}
