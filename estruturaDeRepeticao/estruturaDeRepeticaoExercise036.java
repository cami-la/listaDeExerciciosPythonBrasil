/*Develop a program that makes the multiplication table of any integer that will be typed by the user, but the multiplication table should not necessarily start at 1 and end at 10, the initial and final value must also be informed by the user, as shown below:

    Assemble the multiplication table of: 5
    Starting with: 4
    Finish in: 7

    I'll build the multiplication table of 5 starting at 4 and ending at 7:
    5 X 4 = 20
    5 X 5 = 25
    5 X 6 = 30
    5 X 7 = 35
 */
import java.util.Scanner;

class EstruturaDeRepeticaoExercise036 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println();
		
		System.out.println("Assemble the Multiplication Table: ");
		int number = scan.nextInt();
		
		System.out.println("Start with: ");
		int first = scan.nextInt();
				
		System.out.println("Finish with: ");
		int last = scan.nextInt(); 		
		
		while (first > last) {
			System.out.println("Input Incorret!");
			System.out.println("The last number will be biggest than the fist number, try again!");
			
			System.out.println("Start with: ");
			first = scan.nextInt();
					
			System.out.println("Finish with: ");
			last = scan.nextInt(); 		
		}
		
		System.out.println("I'll build a multiplication table of " + first + " starting and ending at " + last);
		for (int i = first; i <= last; i++) {
			System.out.println(number + " x " + i + " = " + (number*i));
		}
	}
}

