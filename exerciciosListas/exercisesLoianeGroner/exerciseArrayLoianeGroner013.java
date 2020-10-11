//Create a vector A with 10 integer elements. Implement a program that determines a sum of the elements stored in this vector that are multiples of 5.
import java.util.Scanner;

class ExerciseArrayLoianeGroner013 {
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[10];
		
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter the position " + (i+1) + "o. the Array A: ");
			arrayA[i] = scan.nextInt();
			
			if (arrayA[i] % 5 == 0) {
				sum += arrayA[i];
			}
		}
		System.out.println("The sum of the elements stored in this vector that are multiples of 5: " + sum);
	}
}

