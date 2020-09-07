/*A gas station is selling fuel with the following discount table:
Alcohol:
up to 20 liters, 3% discount per liter
over 20 liters, 5% discount per liter
Gasoline:
up to 20 liters, 4% discount per liter
above 20 liters, 6% discount per liter

Write an algorithm that reads the number of liters sold, the type of fuel (coded as follows: A-alcohol, G-gasoline), calculates and prints the amount to be paid by the customer knowing that the price of a liter of gasoline is R $ 2.50 the price of a liter of alcohol is R $ 1.90.
*/
import java.util.Scanner;

class EstruturaDeDecisaoExercise026 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("A-alcohol or G-gasoline? [A/G] ");
    String fuel = scan.next();
    
    double discount = 0;
    double alcoholValue = 0;
    double fuelValue = 0;
    double amountFuel = 0;

    if (fuel.equalsIgnoreCase("A")) {
      System.out.print("How much alcohol? L ");
      amountFuel = scan.nextDouble();
      fuelValue = 1.9;

      if (amountFuel <= 20.0001) {
        discount = 0.03;
      } else {
        discount = 0.05;
      }
    } else if (fuel.equalsIgnoreCase("G")) {
      System.out.print("How much gasoline? L ");
      amountFuel = scan.nextDouble();
      fuelValue = 2.5;

        if (amountFuel <= 20.0001) {
          discount = 0.04;
        } else {
          discount = 0.06;
        }
      }

    double fuelValueTotal = amountFuel*fuelValue*(1-discount);

    System.out.println("The total value of fuel is R$" + fuelValueTotal);
  


  }
}
