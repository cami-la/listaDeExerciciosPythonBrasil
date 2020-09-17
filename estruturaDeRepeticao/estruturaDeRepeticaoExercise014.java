//Make a program taht asks 10 integer numbers, calculates and shows the amount of even numbers and amount of odd numbers.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise014 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    int number;
    int evenCount = 0;
    int oddCount = 0;
    int i = 0;

    while(i < 10) {
      System.out.print("Type the " + (i+1) + "o. number: ");
      number = scan.nextInt();

      if (number % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
      i++;
    }
    System.out.println();
    System.out.println("Even Numbers: " + evenCount);
    System.out.println("Odd Numbers: " + oddCount);
  }

}
