//Make a program that ask the temperature in Celsius degree, transforms and shows in Fahrenheit degree.
import java.util.Scanner;

class EstruturaSequencialExercise010 {
    public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the temperature in Celsius degree: ");
      double temperatureCelcius = scan.nextDouble();

      double convertTemperatureFarenheit = ((9*temperatureCelcius)/5) + 32;

      System.out.println("The temperature " + temperatureCelcius + " in Farenheit is " + convertTemperatureFarenheit);
  }
}
