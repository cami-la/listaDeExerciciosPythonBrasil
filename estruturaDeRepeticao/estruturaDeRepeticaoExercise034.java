// Prime numbers have several applications within Computing, for example in Cryptography. A prime number is one that is divisible only by one and by itself. Make a program that asks for an integer and determines whether or not it is a prime number.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise034 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		int i; 
		
		boolean prime = true;
		
		for (i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("This number is divisible by " + i);
				prime = false;
			} 
		}
		
		if (prime) {
			System.out.println("This number is divisible by 1");
			System.out.println("This number is divisible by" + number);
			System.out.println("This number is prime!");
		}
	}
}
