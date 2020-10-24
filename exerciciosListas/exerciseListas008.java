// Make a Program that asks for the age and height of 5 people, store each information in its respective vector. Print the age and height in reverse order.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ExerciseListas008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ArrayList<Double> heights = new ArrayList<Double>();
		int numberOfPeople = 5;
		
		for (int i = 0; i < numberOfPeople; i++) {
			System.out.print((1+i) + "o. age: ");
			ages.add(scan.nextInt());
			
			System.out.print((1+i) + "o. height: ");
			heights.add(scan.nextDouble());			
		}
		
		System.out.println("\nAges: " + ages.toString());
		System.out.println("Heights: " + heights.toString());
		System.out.println("------");
		Collections.reverse(ages);
		Collections.reverse(heights);
		System.out.println("Reverse Ages: " + ages.toString());
		System.out.println("Reverse Heights: " + heights.toString());
	}

}

