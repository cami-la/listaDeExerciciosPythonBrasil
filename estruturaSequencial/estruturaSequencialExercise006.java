//Make a program that asks for the radius of the circle, calculates and shows the area.

import java.util.Scanner;

class EstruturaSequencialExercise006 {
  public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Type te radius of the circle: ");
  double radiusOfCircle = scan.nextDouble();

  double areaOfCircle = Math.PI * Math.pow(radiusOfCircle,2);

  System.out.println("The area of cicle is: " + areaOfCircle); 


  }
}
