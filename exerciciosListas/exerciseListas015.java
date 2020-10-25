/*Make a program that reads an indeterminate number of values, corresponding to notes, ending the data entry when a value equal to -1 is entered (which should not be stored). After this data entry, do:

    Show the amount of values that have been read;
    Display all values on the order in which they were reported, side by side;
    Display all values on the reverse order to which they were informed, one below the other;
    Calculate and show the sum of the values;
    Calculate and show the average of the values;
    Calculate and show the amount of values ​​above the calculated average;
    Calculate and show the number of values ​​below seven;
    End the program with a message;
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ExerciseListas015 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> values = new ArrayList<Double>();
		
		while(true) {
			System.out.print("Enter the value: ");
			double value = scan.nextDouble();
			if (value == -1) {
				break;
			} else {
				values.add(value);
			}
		}
		
		System.out.println("\nAmount of values: " + values.size());
		
		System.out.println("Values: " + values.toString());
		
		Collections.reverse(values); 
		System.out.println("Values: ");
		double sumValues = 0;
		for (Double value : values) {
			sumValues += value;
			System.out.println(value);
		}
		
		System.out.println("Sum of values: " + sumValues);
		
		System.out.println("Averanger of values: " + (sumValues/values.size()));
		
		int count = 0;
		int countBelow7 = 0;
		for (Double value : values) {
			if (value > (sumValues/values.size()))
				count++;
			if (value < 7) {
				countBelow7++;
			}
		}
		System.out.println("Amount of values above the calculated average: " + count);
		System.out.println("Amount of values below seven: " + countBelow7);
		System.out.println("The end");		
	}
}
