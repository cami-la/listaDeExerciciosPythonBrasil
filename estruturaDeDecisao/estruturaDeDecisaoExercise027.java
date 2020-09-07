/*A fruit tree is selling fruit with the following price list:

                      Up to 5 Kg      Above 5 Kg
Strawberry            R$ 2.50Kg       R$ 2.20Kg
Apple                 R$ 1.80kg       R$ 1.50kg

If the customer buys more than 8 kg of fruit or the total purchase value exceeds R $ 25.00, he will also receive a 10% discount on this total. Write an algorithm to read the quantity (in Kg) of strawberries and the quantity (in Kg) of apples purchased and write the amount to be paid by the customer.
*/
import java.util.Scanner;

class EstruturaDeDecisaoExercise027 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Strawberry(kg): ");
    double strawberry = scan.nextDouble();

    double valueKgStrawberry;
    double valueKgApple;

    if (strawberry <= 5) {
      valueKgStrawberry = 2.5;
    } else {
      valueKgStrawberry = 2.2;
    }

    System.out.println("The price of strawberry R$" + valueKgStrawberry);
    System.out.println("You will pay R$" + (strawberry * valueKgStrawberry) + " in the strawberries.");

    System.out.println();

    System.out.print("Apple(kg): ");
    double apple = scan.nextDouble();

    if (apple <= 5) {
      valueKgApple = 1.8;
    } else {
      valueKgApple = 1.5;
    }
    System.out.println("The price of apple R$" + valueKgApple);
    System.out.println("You will pay R$"  + (apple * valueKgApple) + " in the apples.");

    

    double weightShopping = strawberry + apple;
    double discount;
    double valueShopping = ((strawberry*valueKgStrawberry) + (apple*valueKgApple));
    double valueShoppingWithDiscount = 0;

    System.out.println();
    System.out.println("----------------------------------");
    System.out.println("Total of weight purchase " + weightShopping + "kg.");
    if (weightShopping > 8 || valueShopping > 25) {
      discount = 0.9;
      valueShoppingWithDiscount = valueShopping*discount;
      System.out.println("Value of purchase R$" + valueShopping);
      System.out.println("Your discount was R$" + (valueShopping-valueShoppingWithDiscount));
    } else {
      System.out.println("Value of purchase R$" + valueShopping);
      System.out.println("Your discount was R$" + "0.0 discounts" );
    }
    System.out.println("----------------------------------");
    
    

  }
}
