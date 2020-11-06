//Make a function that reports the number of digits of a given integer entered.
import java.util.Scanner;

class ExerciseFunctions008 {
	
	public void integer(String number) {
		System.out.println("This number has " + number.length() + " numbers.");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ExerciseFunctions008 e = new ExerciseFunctions008();
		
		System.out.println("Enter the integer number: ");
		e.integer(scan.next());
	}
}
