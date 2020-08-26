/*Make a program that asks two integer numbers and a real number. Calculates and shows:
A) The product of double of first with of half second;
B) The sum of triple of first with the thirt;
C) The cube of thirt 
*/
import java.util.Scanner;

class EstruturaSequencialExercise011 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter the first integer number: ");
    int firtIntegerNumber = scan.nextInt();
    System.out.print("Enter the second integer number: ");
    int secondIntegerNumber = scan.nextInt();
    System.out.print("Enter the real number: ");
    double realNumber = scan.nextDouble();

    int alternativeA = (firtIntegerNumber*2) * (secondIntegerNumber/2);
    double alternativeB = (firtIntegerNumber*3) + realNumber;
    double alternaticeC = Math.pow(realNumber,3);

    System.out.println("The product of double of first with of half second = " + alternativeA);
    System.out.println("The sum of triple of first with the thirt = " + alternativeB);
    System.out.println("The cube of thirt = " + alternaticeC);

  }
}
