//Create a vector A with 10 integer elements. Implement a program that defines and writes the simple arithmetic mean of the odd elements stored in this vector.
import java.util.Scanner;

class ExerciseArrayLoianeGroner014 {
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[10];
		
		int count = 0;
		double sum = 0;
    double avanger;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter the position " + (i+1) + "o. the Array A: ");
			arrayA[i] = scan.nextInt();
			
			if (arrayA[i] % 2 != 0) {
				sum += arrayA[i];
				count++;
			}
		}
		
    avanger = sum/count;
		System.out.println("The simple arithmetic mean of the odd elements stored in this vector:  " + avanger);
	}
}
  
