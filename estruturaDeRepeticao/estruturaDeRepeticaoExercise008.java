// Make a program that reads 5 numbers and gives the sum and average of the numbers.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise008 {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println();

    int count = 0;
    int sum = 0;
    int number = 0;

    while(count < 5){
      System.out.print("Type the " + (count+1) + " number: ");
      number = scan.nextInt();
      sum += number;
      count++;
    }
    System.out.println("The number of sum is "+ (sum));
    System.out.println("The avenger is " + (sum/count));
  }
}
