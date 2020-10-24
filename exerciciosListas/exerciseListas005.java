/*Make a Program that reads 20 integers numbers and stores them in a vector. 
Store the even numbers in the even vector and the odd numbers in the odd vector.Print the three vectors.
*/
import java.util.ArrayList;
import java.util.Scanner;

class ExerciseListas005 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

		int totalNumbers = 20;
		
		for (int i = 0; i < totalNumbers; i++) {
			System.out.print((i+1) + "o. number: ");
			int number = scan.nextInt();
			numbers.add(number);
			
			if (numbers.get(i) % 2 == 0) {
				evenNumbers.add(number);
			} else {
				oddNumbers.add(number);
			}
		}
		
		System.out.println("\nNumbers: " + numbers.toString());
		System.out.println("Even numbers: " + evenNumbers.toString());
		System.out.println("Odd numbers: " + oddNumbers.toString());
	}

}

