//Make a program that reads a array of real numbers and show them in reverse order.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class ExerciseListas002 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> array = new ArrayList<Double>();
		int lengthArray = 10;
		
		for (int i = 0; i < lengthArray; i++) {
			System.out.print("Enter the number of " + (i+1) + "o. position: ");
			array.add(scan.nextDouble());
		}
		Collections.reverse(array);
		
		
		System.out.print("\nReverse Array: ");
		System.out.print(array.toString());
	}
}

