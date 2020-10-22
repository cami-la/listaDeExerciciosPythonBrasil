/*Create two vectors A and B each with 10 integer elements. Construct a vector C of the same type and size, obeying the following formation rules:
a) Ci should receive 1 when Ai is greater than Bi; b) Ci should receive 0 when Ai is equal to Bi; 
c) Ci should receive -1 when Aifor is less than Bi.
*/
import java.util.Scanner;

class ExerciseArrayLoianeGroner { 
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[10];
		int[] arrayB = new int[arrayA.length];
		int[] arrayC = new int[arrayA.length];
		
		for (int i=0; i < arrayA.length; i++) {
			System.out.print("Enter the " + (i+1) + "o. number of arrayA");
			arrayA[i] = scan.nextInt();
			
			System.out.print("Enter the " + (i+1) + "o. number of arrayB");
			arrayB[i] = scan.nextInt();
			
			if (arrayA[i] > arrayB[i]) {
				arrayC[i] = 1;
			} else if (arrayA[i] == arrayB[i]) {
				arrayC[i] = 0;
			} else {
				arrayC[i] = -1;
			}
		}
		
		System.out.print("ArrayA = ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("ArrayB = ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayB[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("ArrayC = ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayC[i] + " ");
		}
	}
}

