//Make a program that asks the temperature in Fahrenheit degree, transform and show the temperature in Celsius degree.
import java.util.Scanner;

class EstruturaSequencialExercise009 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the temperature in Fahrenheit: ");
    double temperatureFahrenheit = scan.nextDouble();

    double convertTemperatureCelcius =  5 * ((temperatureFahrenheit-32) / 9);
    
    System.out.println("The temperature " + temperatureFahrenheit + "F in Celsius is " + convertTemperatureCelcius + "C" );
  }
}
