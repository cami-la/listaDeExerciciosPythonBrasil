//Change the previous program, inserting 3 vectors of 10 elements each.
import java.util.ArrayList;
import java.util.Scanner;

class ExerciseListas011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arrayA = new ArrayList<Integer>();
		ArrayList<Integer> arrayB = new ArrayList<Integer>();
		ArrayList<Integer> arrayC = new ArrayList<Integer>();
		ArrayList<Integer> arrayD = new ArrayList<Integer>();
		int lengthArrayA = 5;
		
		for (int i = 0; i < lengthArrayA; i++) {
			System.out.print((i+1) + "o. number of arrayA: ");
			int number = scan.nextInt();
			
			arrayA.add(number);
			arrayD.add(number);
			
			System.out.print((i+1) + "o. number of arrayB: ");
			int number2 = scan.nextInt();
			
			arrayB.add(number2);
			arrayD.add(number2);
			
			System.out.print((i+1) + "o. number of arrayC: ");
			int number3 = scan.nextInt();
			
			arrayC.add(number3);
			arrayD.add(number3);
			
		}
		
		System.out.println("Array A: " + arrayA.toString());
		System.out.println("Array B: " + arrayB.toString());
		System.out.println("Array C: " + arrayC.toString());
		System.out.println("Array C: " + arrayD.toString());
	}
		
}

