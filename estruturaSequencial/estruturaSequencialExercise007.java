//Make a program that calculates the area of square, next shows the double this area to user.
import java.util.Scanner;

class EstruturaSequencialExercise007 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the value on the side of the square: ");
    double sizeSquare = scan.nextDouble();
    
    double areaSquare = Math.pow(sizeSquare,2);
    double doubleAreaSquare = areaSquare*2;

    System.out.println("The double of the area of the square is " + doubleAreaSquare);
  }
}
