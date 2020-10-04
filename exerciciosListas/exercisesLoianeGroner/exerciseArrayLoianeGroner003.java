// Create a vector A with 15 integer elements. Build a vector B of the same type and size, each element of vector B should be the square of the respective element of A, that is: B [i] = A [i] * A [I].
import java.util.Scanner;

class ExerciseArrayLoianeGroner003 { 
  public static void main(String[] args) {
    System.out.println();
		Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[15];
		int[] arrayB = new int[arrayA.length];
		
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("Enter the position " + (i+1) + "o. of the array A: " );
			arrayA[i] = scan.nextInt();
			
			arrayB[i] = (int) Math.pow(arrayA[i], 2); 
		}
		
		System.out.print("Array A = ");
		for (int i = 0; i < (arrayA.length); i++) {
			if (i == arrayA.length-1) {
				System.out.println(arrayA[i]);
			}
			else {
				System.out.print(arrayA[i] + ", ");
			}
		}
		
		System.out.print("Array B = ");
		for (int i = 0; i < (arrayB.length); i++) {
			if (i == arrayB.length-1) {
				System.out.println(arrayB[i]);
			} else {
				System.out.print(arrayB[i] + ", ");
			}
		}		
	}	
}


