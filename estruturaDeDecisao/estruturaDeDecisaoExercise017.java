//Make a Program that asks for a number corresponding to a certain year and then inform if this year is leap or not. 
import java.util.Scanner;

class EstruturaDeDecisaoExercise017 {
  public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter actual year: ");
		int year = scan.nextInt();
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
			System.out.println(year + " is a leap year!");
		} else {
			System.out.println(year + " isn't a leap year");
		}
	}
}
