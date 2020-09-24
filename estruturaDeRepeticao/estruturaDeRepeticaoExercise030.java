/*Mr. Manoel Joaquim has just acquired a bakery and intends to implement the table methodology, which is already a success in his 1.99 store. You were hired to develop the program that assembles the bread price list, from 1 to 50 loaves, based on the price of bread informed by the user, as shown in the example below:

    Price of bread: R $ 0.18
    Yesterday's Bread Maker - Price List
    1 - R $ 0.18
    2 - R $ 0.36
    ...
    50 - R $ 9.00
*/
import java.util.Scanner;

class EstruturaDeRepeticaoExercise030 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Type the price of bread: ");
    double standardPriceOfBread = scan.nextDouble();

    System.out.println("------------------------------");
    System.out.println("Almost Two Stores - Price list");
    for (int i = 1; i <= 50; i++) {
      System.out.println(i + " - " + "R$" + (standardPriceOfBread*i));
    }
    System.out.println("------------------------------");
  }
}

