//Make a program, with a function that needs three arguments, and that provides the sum of those three arguments.
import java.util.Scanner;

class ExerciseFunctions003 {
	public void sum(int number1, int number2, int number3) {
		System.out.println("The sum is: " + (number1 + number2 + number3));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ExerciseFunctions003 e = new ExerciseFunctions003();
		
		System.out.print("Enter number1: ");
		int number1 = scan.nextInt();
		System.out.print("Enter number2: ");
		int number2 = scan.nextInt();
		System.out.println("Enter number3: ");
		int number3 = scan.nextInt();		
		
		e.sum(number1, number2, number3);
	}
}


