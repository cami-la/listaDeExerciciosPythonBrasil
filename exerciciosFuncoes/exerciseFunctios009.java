//Number reverse. Make a function that returns the reverse of an informed integer. For example: 127 -> 721.
import java.util.Scanner;

class ExerciseFunctions009 {
	public void reverse(String number) {
		System.out.println(number + " -> " + new StringBuilder(number).reverse().toString());
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ExerciseFunctions009 e = new ExerciseFunctions009();
		
		System.out.print("Enter the integer number: ");
		e.reverse(scan.next());
	}		
}
