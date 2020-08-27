//Make a program for a paint store. The program should ask for the size in square meters of the area to be painted. Consider that the paint coverage is 1 liter for every 3 square meters and that the paint is sold in 18-liter cans, which cost R $ 80.00. Inform the user of the quantities of paint cans to be purchased and the total price.
import java.util.Scanner;

class EstruturaSequencialExercise016 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("How big is the wall to be painted? (m2) ");
    
    double sizeWall = scan.nextDouble();
    System.out.println("The wall size is " + sizeWall + "m2");

    double calculateTint = sizeWall/3;
    System.out.println("It will be necessary " + 
    calculateTint + "L of the tint.");
    
    double canTint = Math.round(calculateTint/18);
    System.out.println("Total de " + canTint + " cans");

    double priceTotal = canTint*80;
    System.out.println("Total price R$" + priceTotal);

  }
}
