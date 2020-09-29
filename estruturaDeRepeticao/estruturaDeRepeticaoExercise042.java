//Make a program that reads an undetermined amount of positive numbers and count how many of them are in the following ranges: [0-25], [26-50], [51-75] and [76-100]. Data entry should end when a negative number is read.
import java.util.Scanner;

class  EstruturaDeRepeticaoExercise042 {
  public static void main(String[] args) {
    System.out.println();
		Scanner scan = new Scanner(System.in);
		
		int shortest25 = 0;
		int shortest50 = 0;
		int shortest75 = 0;
		int shortest100 = 0;
		
		int number = 0;
		while(number >= 0) {
			System.out.print("Enter a number: ");
			number = scan.nextInt();
			
			if (number >= 0 && number <= 25) {
				shortest25++;
			} else if (number >= 26 && number <= 50) {
				shortest50++;
			} else if (number >= 51 && number <= 75) {
				shortest75++;
			} else if (number >= 76 && number <= 100) {
				shortest100++;
			}
		}
		System.out.println("[0-25]: " + shortest25);
		System.out.println("[26-50]: " + shortest50);
		System.out.println("[51-75]: " + shortest75);
		System.out.println("[76-100]: " + shortest100);
	}
}

