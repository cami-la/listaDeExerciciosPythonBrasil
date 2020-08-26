//Make a program that converts meters to centimeters.
import java.util.Scanner;

class EstruturaSequencialExercise005 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.print("Type the measurement in meters: ");
    double meters = scan.nextDouble();

    double centimeters = meters*100;

    System.out.println("The measurement " + meters + " in centimeters is " + centimeters);
  }
}
