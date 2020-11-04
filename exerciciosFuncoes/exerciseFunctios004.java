/* Make a program, with a function that needs an argument. 
The function returns the character value 'P', if its argument is positive, and 'N', if its argument is zero or negative.
*/
import java.util.Scanner;

class ExerciseFunctions004 {
	public void print(int number) {
		String letter;
		if (number > 0) {
			letter = "P"; 
		} else {
			letter = "N";
		}
		System.out.println(letter);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ExerciseFunctions004 e = new ExerciseFunctions004();
		
		System.out.print("Enter the number: ");
		int number = scan.nextInt();
		
		e.print(number);
	}
}
 
