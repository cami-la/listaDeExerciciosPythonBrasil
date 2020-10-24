// Make a Program that asks for the four grades of 10 students, calculate and store the average of each student in a vector, print the number of students with an average greater than or equal to 7.0.
import java.util.ArrayList;
import java.util.Scanner;

class ExerciseListas006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> averages = new ArrayList<Double>();
		int amountOfStudents = 10;
		int amountOfGrades = 4;
		
		for (int i = 0; i < amountOfStudents; i++) {
			double sumNotes = 0;
			System.out.println((i+1) + "o. stutent: ");			
			for (int j = 0; j < amountOfGrades; j++) {
				System.out.print((j+1) + "o. grade ");
				sumNotes += scan.nextDouble();
			}
			averages.add(sumNotes/amountOfGrades);
			System.out.println("------");
		}
			
		System.out.println("Average of Students: " + averages.toString());
		
		System.out.print("Amount of students of average bigger than 7: ");
		int count = 0;
		for (Double average: averages) {
			if (average >= 7) {
				count++;
			}
		}
		System.out.println(count);
	}
}

