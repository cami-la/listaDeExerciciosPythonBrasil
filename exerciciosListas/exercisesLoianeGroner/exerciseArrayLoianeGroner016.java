//Create a vector A with 10 integer elements. Write a program that calculates and writes: a) the sum of elements stored in this vector that are less than 15; b) the amount of elements stored in the vector that are equal to 15; and c) the average of the elements stored in the vector that are greater than 15.
import java.util.Scanner;

class ExerciseArrayLoianeGroner016 {
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[10];
		
		int sumLess15 = 0;
		int countLess15 = 0;
		int countGreater15 = 0;
		int sumGreater15 = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter the position " + (i+1) + "o. the Array A: ");
			arrayA[i] = scan.nextInt();
			
			if (arrayA[i] < 15) {
				sumLess15 += arrayA[i];
			} else if (arrayA[i] == 15) {
				countLess15++;
			} else if (arrayA[i] > 15) {
				countGreater15++;
				sumGreater15 += arrayA[i];
			}
		}
		System.out.println("The sum of elements less than 15: " + sumLess15);
		System.out.println("The amount of elements that are equal to 15: " + countLess15);
		System.out.println("The average of the elements that are greater than 15: " + (sumGreater15/(double)countGreater15));
	}
}

  

