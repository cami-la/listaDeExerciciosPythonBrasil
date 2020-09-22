// change the prime number calculation program, informing, if the number is not prime, by which number it is divisible.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise022 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Type a number: ");
    int number = scan.nextInt();

    boolean prime = true;
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        System.out.println("This number is divisible by " + i);
        prime = false;  
      }
    }
    
    if (prime) {
      System.out.println("This number " + number + " is prime.");
    }
  }
}
