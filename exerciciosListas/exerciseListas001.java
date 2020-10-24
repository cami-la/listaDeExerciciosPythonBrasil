// Make a program that reads a vetor of 5 integers numbers and display.
import java.util.Scanner;
import java.util.ArrayList;

class ExerciseListas001 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();
	
	ArrayList<Integer> array = new ArrayList<Integer>();
	int lengthArray = 5;
		
		for (int i = 0; i < lengthArray; i++) {
			System.out.print("Enter the number of " + (i+1) + "o. position: ");
			array.add(scan.nextInt());
		}
		
		System.out.print("\nArray: ");
		System.out.println(array.toString());
		
		/*
		System.out.print("\nArray: ");
		for (Integer number : array) {
			System.out.print(number + " ");
		}
		*/
	}
}

