//Create a vector A with 10 integer elements. Implement a program that defines and writes the number of elements stored in this vector that are pairs.
import java.util.Scanner;

class ExerciseArrayLoianeGroner011 {
  public static void main(String[] args) {
    System.out.println();
		Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[10];
		
		int count = 0;
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("Enter the position " + (i+1) + "o. the Array A: ");
			arrayA[i] = scan.nextInt();
			
			if (arrayA[i] % 2 == 0) {
				count++;
			}
		}
		
		System.out.println("There are " + count + " even numbers.");
	}
}

