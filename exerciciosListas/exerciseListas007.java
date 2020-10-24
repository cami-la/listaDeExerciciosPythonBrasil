//Make a Program that reads a vector of 5 integer numbers, shows the sum, multiplication and numbers.
import java.util.ArrayList;
import java.util.Scanner;

class ExerciseLista007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> integers = new ArrayList<Integer>();
		int lengthArrayIntegers = 5;
		
		int sumIntegers = 0;
		int multiplicationIntegers = 1;
		
		for (int i = 0; i < lengthArrayIntegers; i++) {
				System.out.print((i+1) + "o. number: ");
				int number = scan.nextInt();
				integers.add(number);
				sumIntegers += number;
				multiplicationIntegers *=  number;
		}
		
		System.out.println("\nNumbers " + integers.toString());
		System.out.println("Sum: " + sumIntegers);
		System.out.println("Multiplication: " + multiplicationIntegers);

	}

}

