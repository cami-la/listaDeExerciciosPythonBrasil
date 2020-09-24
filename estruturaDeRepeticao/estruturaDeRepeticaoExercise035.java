//Finding prime numbers is a difficult task. Make a program that generates a list of prime numbers between 1 and an integer entered by the user.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise035 {
   	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the last number: ");
		int lastNumber = scan.nextInt();
		
		boolean prime = true;
		int number = 1;
		
		for (int i = 2; i < lastNumber; i++) {			
			if (number % 2 == 0) {
				prime = false;
			} else { 
				System.out.println(number);
			}
			number++;
		}
	}
}
