//The ages and heights of 30 students were noted. Make a Program that determines how many students over 13 are taller than their average height.
import java.util.ArrayList;
import java.util.Scanner;

class ExerciseListas012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> heigthsBigger13 = new ArrayList<Double>();
		int numberOfStudent = 30;
		
		double sumHeights = 0;
		for (int i = 0; i < numberOfStudent; i++) {
			System.out.print("Age of " + (i+1) + "o. student: ");
			int age = scan.nextInt();
						
			System.out.print("Height of " + (i+1) + "o. student: ");
			double height = scan.nextDouble();
			sumHeights += height;
			
			if (age > 13) {
				heigthsBigger13.add(height);

			}
		}
		
		double avanger = sumHeights/ numberOfStudent;
		
		int count = 0;
		for (Double height : heigthsBigger13) {
			if (height > avanger) {
				count++;
			}
		}
		
		System.out.println("Avanger of Heights: " + avanger);
		System.out.println(count);
	}
}

