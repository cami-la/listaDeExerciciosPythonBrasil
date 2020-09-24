// Make a program that calculates the total amount invested by a collector in your CD collection and the average amount spent on each one. The user must inform the number of CDs and the value for each one.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise028 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter the quantity of CDs purchased: ");
    int numberOfCDs = scan.nextInt();

    double sum = 0;
    int count = 0;
    double priceOfCd;

    while (count < numberOfCDs) {
      System.out.print("Enter the value of CD " + (count+1) + ": R$ ");
      priceOfCd = scan.nextDouble();
      
      sum += priceOfCd;
      count += 1;
    }

    System.out.println("The amount invested was " + sum);
  }
}
