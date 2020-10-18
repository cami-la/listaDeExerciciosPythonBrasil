// * Randomly generate a vector A with 10 integers equal to 0 and 1, suggestion: A [i] = (int) Math.round (Math.random () * 1); It is asked to implement a program that determines the percentage of numbers 0's and 1's in vector A.
import java.util.Scanner;

class ExerciseArrayLoianeGroner{ 
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		
		int[] arrayA = new int[10];
		int count0 = 0;
		int count1 = 0;
		
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) Math.round (Math.random () * 1); 
			
			if (arrayA[i] == 0) {
				count0 ++;
			} else {
				count1++;
			}
		}
		
		System.out.print("ArrayA = ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		
		System.out.println();
		double perc0 = (count0*100)/arrayA.length;
		double perc1 = (count1*100)/arrayA.length;
		
		
		System.out.println("Perc 0 " + perc0 + "%");
		System.out.println("Perc 1 " + perc1 + "%");
		
	}

}

