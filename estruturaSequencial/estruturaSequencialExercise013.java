/*Having as input the height (h) of a person, build an algorithm that calculates your ideal weight, using the following formulas:
For men: (72.7 * h) - 58
For women: (62.1 * h) - 44.7
*/
import java.util.Scanner;

class EstruturaSequencialExercise013 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter with your gender: [M/W] ");
    String gender = scan.next();
    System.out.print("Enter with your height: [M/W] ");
    double height = scan.nextDouble();


    if (gender.equalsIgnoreCase("m")) {
      double idealWeight = (72.7 * height) - 58;
      System.out.println("The ideal height is " + idealWeight);
    } else if (gender.equalsIgnoreCase("w")) {
      double idealWeight = (62.1 * height) - 44.7;
      System.out.println("The ideal height is " + idealWeight);
    } else {
      System.out.println("Invalid Input!");
    }    
  }
}
