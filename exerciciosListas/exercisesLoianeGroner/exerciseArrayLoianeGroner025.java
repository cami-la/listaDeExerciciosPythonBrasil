//Create a vector A with 10 integer elements. Build a vector B of the same type and size, obeying the following rules of formation: a) You should receive 1 when Aifor even; b) You should receive 0 when Ai is odd.
import java.util.Scanner;

class ExerciseArrayLoianeGroner025 { 
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		
		int[] arrayA = new int[10];
		int[] arrayB = new int[arrayA.length];
		
		for (int i = 0; i < arrayA.length; i++) {
	    	System.out.print("Enter the number: ");
	    	arrayA[i] = scan.nextInt(); 
	    	
	    	if (arrayA[i] % 2 == 0) {
	    		arrayB[i] = 0;
	    	} else {
	    		arrayB[i] = 1;
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
	}
}

