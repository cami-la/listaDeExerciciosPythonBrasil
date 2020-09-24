/*Make a program that calculates the factorial of an integer provided by the user. Ex .: 5! = 5.4.3.2.1 = 120. 
The output should be according to the example below:

Factorial of: 5
5! = 5. 4. 3. 2 . 1 = 120
*/
import java.util.Scanner;

class  EstruturaDeRepeticaoExercise032 {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
		
		int factorial = 1;
		
		System.out.print("Enter number to factorial: ");
		int number = scan.nextInt();
		
		System.out.println("Factorial of the: " + number);
		System.out.print(number + "! = ");
		for (int i = number; i >= 1; i--) {
			factorial *= i;

			if (i != 1) {
				System.out.print(i + ". ");
			} else {
				System.out.print(i + " = ");
			}
		}
		System.out.println(factorial);
	}
}

