// Make a program that reads 5 numbers and reports the largest number.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise007 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    int count = 0;
    int bigger = Integer.MIN_VALUE;
    int number;
    
    while(count < 5) {
      count++;
      System.out.print("Number: ");
      number = scan.nextInt();

      if (number > bigger) {
        bigger = number;
        System.out.println("The bigger number changed to " + bigger);
      }      
    }
    System.out.println("The bigger is " + bigger);
  }
}
