//Create a vector A with 5 integer elements. Construct a vector B of the same type and size and with the "same" elements of vector A, that is, B [i] = A [i].
import java.util.Scanner;

class  ExerciseArrayLoianeGroner001 {
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[5];
		int[] arrayB = new int[arrayA.length];
		
		for (int i = 0; i < (arrayA.length); i++) {
			System.out.print("Enter the position " + (i+1) + "o. of the array A: " );
			arrayA[i] = scan.nextInt();
			
			arrayB[i] = arrayA[i]; 
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

