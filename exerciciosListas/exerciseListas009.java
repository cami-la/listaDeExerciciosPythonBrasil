//Make a Program that reads a vector A with 10 integers, calculate and show the sum of the squares of the elements of the vector.
import java.util.ArrayList;
import java.util.Scanner;

class ExerciseListas009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arrayA = new ArrayList<Integer>();
		int lengthArrayA = 5;
		
		for (int i = 0; i < lengthArrayA; i++) {
			System.out.print((i+1) + "o. number: ");
			int number = scan.nextInt();
			arrayA.add((int) Math.pow(number, 2));
		}
		
		int sumArrayA = 0;
		for(Integer i: arrayA) {
			sumArrayA += i;
		}
		
		System.out.println("squares of the elements of array A: " + arrayA.toString());
		System.out.println("The sum: " + sumArrayA);
	}
}

