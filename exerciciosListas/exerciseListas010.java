//Make a Program that reads two vectors with 10 elements each. Generate a third vector of 20 elements, whose values must be composed of the elements interspersed with the two other vectors.
import java.util.ArrayList;
import java.util.Scanner;

class ExerciseListas010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arrayA = new ArrayList<Integer>();
		ArrayList<Integer> arrayB = new ArrayList<Integer>();
		ArrayList<Integer> arrayC = new ArrayList<Integer>();
		int lengthArrayA = 10;
		
		for (int i = 0; i < lengthArrayA; i++) {
			System.out.print((i+1) + "o. number of arrayA: ");
			int number = scan.nextInt();
			
			arrayA.add(number);
			arrayC.add(number);
			
			System.out.print((i+1) + "o. number of arrayB: ");
			int number2 = scan.nextInt();
			
			arrayB.add(number2);
			arrayC.add(number2);
			
		}
		
		System.out.println("Array A: " + arrayA.toString());
		System.out.println("Array B: " + arrayB.toString());
		System.out.println("Array C: " + arrayC.toString());
	}
}

