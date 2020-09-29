//Make a program that reads ten sets of two values, the first representing the student's number and the second representing their height in centimeters. Find the highest and lowest student. Show the highest student number and the lowest student number, along with their heights.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise039 {
  public static void main(String[] args) {
    System.out.println();

    Scanner scan = new Scanner(System.in);
		
		double tallestStudent = Integer.MIN_VALUE;
		double shortestStudent = Integer.MAX_VALUE;
		
		int codStudent;
		int codTallestStudent = 0;
		int codShortestStudent = 0;

		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Student Cod.: ");
			int codSudent = scan.nextInt();
			
			System.out.print("Student Height: ");
			double heightStudent = scan.nextDouble();			
			
			if (heightStudent > tallestStudent) {
				codTallestStudent = codSudent;
				tallestStudent = heightStudent;
			}
			if (heightStudent < shortestStudent) {
				codShortestStudent = codSudent;
				shortestStudent = heightStudent;
			}				
		}
		System.out.println("------");
		System.out.println("Tallest Student Height: " + codTallestStudent + " - " + tallestStudent);
		System.out.println("Shortest Student Height: " + codShortestStudent + " - " + shortestStudent );

	}
		
}
