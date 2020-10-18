/*Implement a program that obtains the dollar (U $) in relation to the real (R $) and then store the following conversions in vector A with 20 elements:
A [i] = dollar quote * i, for all i ranging from 1 to 20.
*/
import java.util.Scanner;

class ExerciseArrayLoianeGroner020 {
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		
		double[] arrayA = new double[20]; 
		
		System.out.print("Enter the value of dollar: ");
		double valueOfDollar = scan.nextDouble();
		
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = valueOfDollar * (i+1);
		}
		
		System.out.println("ArrayA = ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println(arrayA[i] + " ");
		}
	}

}

