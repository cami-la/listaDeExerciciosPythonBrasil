//Create a vector A with 10 integer elements. Develop a program that defines the percentage of even and odd elements, respectively, stored in this vector.
import java.util.Scanner;

class ExerciseArrayLoianeGroner015 {
  public static void main(String[] args) {
    System.out.println();
 		Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[10];
		
		int odd = 0;
		int even = 0;
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("Enter the position " + (i+1) + "o. the Array A: ");
			arrayA[i] = scan.nextInt();
			
			if (arrayA[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			
		}

		System.out.println("Even: " + ((even/(double) arrayA.length)*100) + "%");
		System.out.println("Odd: " +  ((odd/(double) arrayA.length)*100) + "%");
	}
}

