//Make a program that reads 4 grades, show the grades and the averanger on the screen. 
import java.util.ArrayList;
import java.util.Scanner;

class ExerciseListas003 {
	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> grades = new ArrayList<Double>();
		int lengthArrayGrade = 4;
		
		for (int i = 0; i < lengthArrayGrade; i++) {
			System.out.print((i+1) + "o. grade: ");
			grades.add(scan.nextDouble());
		}
		
		double sumGrades = 0;
		for (Double grade : grades) {
			sumGrades += grade;
		}
		
		System.out.println("Grades " + grades.toString());
		System.out.println("The avanger of grades is: " + (sumGrades/grades.size()));
		
	}

}

