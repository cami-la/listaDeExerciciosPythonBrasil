//Taking as input data a person's height, build an algorithm that calculates your ideal weight, using the following formula: (72.7 * height) - 58
import java.util.Scanner;

class EstruturaSequencialExercise012 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your height: ");
    double height = scan.nextDouble();

    double ideal_weight = (72.7 * height) - 58;
    
    System.out.println("The ideal weight is = " + ideal_weight + "kg");
  }
}
