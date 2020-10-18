//Create a vector A with 10 integer elements. Develop a program that verifies that "all" elements of vector A are pairs. If at least one element of the vector is not even, the repetition process to go through the elements of the vector should be ended, as a suggestion: use a variable of type flag to achieve this purpose.
import java.util.Scanner;

class ExerciseArrayLoianeGroner023 {
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		
		int[] arrayA = new int[10];
		int number;
		boolean numberIsodd = true;
		
		
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("Enter the number: ");
			number = scan.nextInt();
			
			if (number % 2 == 0) {
				arrayA[i] = number;
			} else {
				break;
			}
		}		
		
		System.out.print("ArrayA = ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		
		System.out.println();
	}
}
