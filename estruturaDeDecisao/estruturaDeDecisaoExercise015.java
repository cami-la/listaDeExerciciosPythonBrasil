/* Make a Program that asks for the 3 sides of a triangle. The program should inform if the values ​​can be a triangle. Indicate, if the sides form a triangle, if it is: equilateral, isosceles or scalene.

    Tips:
    Three sides form a triangle when the sum of any two sides is greater than the third;
    Equilateral Triangle: three equal sides;
    Isosceles Triangle: any two equal sides;
    Scalene Triangle: three different sides;
*/
import java.util.Scanner;

class EstruturaDeDecisaoExercise015 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter the first side of triangle: ");
    double side1 = scan.nextDouble();

    System.out.print("Enter the second side of triangle: ");
    double side2 = scan.nextDouble();

    System.out.print("Enter the thirth side of triangle: ");
    double side3 = scan.nextDouble();

    if (side1 + side2 > side3 && side1 + side3 > side2 &&
        side2 + side3 > side1) {
      System.out.print("Yes, is ");    
      if (side1 == side2 && side2 == side3) {
        System.out.println("Equilateral Triangle");    
      } else if (side1 != side2 && side1 != side3 && side2 != side3) {
        System.out.println("Scalene Triangle"); 
      } else if (side1 == side2 || side1 == side3 || side2 == side3) {
        System.out.println("Scalene Triangle");
      }

    } else {
      System.out.println("No, isn't a tringle.");    
    }
  }
}
