//Create two vectors A and B each with 10 integer elements. Build a vector C, where each element of C is the multiplication of the respective elements in A and B, that is: C [i] = A [i] * B [i]
import java.util.Scanner;

class ExerciseArrayLoianeGroner008 {
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
	    int[] arrayA = new int[10];
	    int[] arrayB = new int[arrayA.length];
	    int[] arrayC = new int[arrayA.length];
	    
	    for (int i = 0; i < arrayA.length; i++) {
	      System.out.print("Enter the position " + (i+1) + "o. of the array A: " );
	      arrayA[i] = scan.nextInt();
	      
	      System.out.print("Enter the position " + (i+1) + "o. of the array B: " );
	      arrayB[i] = scan.nextInt();
	      
	      arrayC[i] = arrayA[i] * arrayB[i];
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
	    
	    System.out.print("Array C = ");
	    for (int i = 0; i < (arrayC.length); i++) {
	      if (i == arrayC.length-1) {
	        System.out.println(arrayC[i]);
	      } else {
	        System.out.print(arrayC[i] + ", ");
	      }
	    }		
	}	
}



