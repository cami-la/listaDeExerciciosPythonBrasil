//Make a program that asks for an integer and determines whether or not it is a prime number. A prime number is one that is divisible only by itself and by 1.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise021 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Type a number: ");
    int number = scan.nextInt();

    boolean prime = true;
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        System.out.println("This number " + number + " isn't prime.");
        prime = false;
        break;
      }
    }
    
    if (prime) {
      System.out.println("This number " + number + " is prime.");
    }
  }
}
