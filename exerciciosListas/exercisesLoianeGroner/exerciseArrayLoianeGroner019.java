/* Read the two bimonthly notes for a group of 10 students. Store the notes informed in two real “Note1” and “Note2” vectors. 
Write a program that calculates the simple arithmetic mean of the informed notes by storing the result in a "Result" vector of the same type and size. When showing the results display the situation of each student.
If the calculated average is greater than or equal to 7, the student will be "approved", otherwise the student's situation will be "failed".
*/
import java.util.Scanner;

class ExerciseArrayLoianeGroner019 { 
  public static void main(String[] args) {
    System.out.println();
    System.out.println();
		Scanner scan = new Scanner(System.in);
		
		double[] notes1 = new double[10];
		double[] notes2 = new double[notes1.length];
		double[] result = new double[notes1.length];
		
		for (int i = 0; i < notes1.length; i++) {
			System.out.print("Enter the note of the " + (i+1) + "o. student: ");
			notes1[i] = scan.nextDouble();
			
			System.out.print("Enter the note of the " + (i+1) + "o. student: ");
			notes2[i] = scan.nextDouble();
			
			result[i] = (notes1[i] + notes2[i])/2;
			}			
			
		System.out.println("----------");
		
		for (int i = 0; i < notes1.length; i++) {
			System.out.print((i+1) + "o. the student's grade is: " + result[i]);
			
			if (result[i] > 7) {
				System.out.println(" - Aproveded");

			} else {
				System.out.println(" - Fail");

			}
		}
	}
}

