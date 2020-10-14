//Read a vector A with 10 integers corresponding to the ages of a group of people. Write a program that determines and writes the youngest and oldest ages and their respective positions.
import java.util.Scanner;

class ExerciseArrayLoianeGroner018 {
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);

 		int[] arrayA = new int[10];

    double biggestAge = Integer.MIN_VALUE;
    double smallestAge = Integer.MAX_VALUE;
    int positionBiggest = 0;
    int positionSmallest = 0;

    for (int i = 0; i < 10; i++) {
			System.out.print("Enter the position " + (i+1) + "o. the Array A: ");
			arrayA[i] = scan.nextInt();
			
			if (arrayA[i] > biggestAge) {
				biggestAge = arrayA[i];
        positionBiggest = i + 1;
			}
      if (arrayA[i] < smallestAge) {
				smallestAge = arrayA[i];
        positionSmallest = i + 1;
			}
    }
    System.out.println("The biggest age is " + biggestAge + " in the " + positionBiggest);
    System.out.println("The smallest age is " + smallestAge + " in the " + positionSmallest);
  }
}
