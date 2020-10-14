//Read a vector A with 10 integers corresponding to the ages of a group of people. Write a program that determines and writes the number of people over the age of 35
import java.util.Scanner;

class ExerciseArrayLoianeGroner017 {
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[10];
		
		int count = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter the position " + (i+1) + "o. the Array A: ");
			arrayA[i] = scan.nextInt();
			
			if (arrayA[i] > 35) {
				count++;
			}
		}
		System.out.println("The people over the age of 35: " + count);
	}
}

