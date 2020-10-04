//Create a vector A with 15 integer elements. Build a vectorB of the same size, each element of vector B must be the square root of the respective element of A, that is: B [i] = sqrt (A [i]).
import java.util.Scanner;

class ExerciseArrayLoianeGroner004 {
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[8];
		double[] arrayB = new double[arrayA.length];
		
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("Enter the position " + (i+1) + "o. of the array A: " );
			arrayA[i] = scan.nextInt();
			
			arrayB[i] = Math.sqrt(arrayA[i]); 
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


