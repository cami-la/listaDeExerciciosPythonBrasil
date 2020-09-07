/*Hipermercado Tabajara has a meat promotion that is a must. Check out:
                      Up to 5 Kg    Above 5 Kg
Double File           R$ 4.90Kg     R$ 5.80Kg
Rump                  R$ 5.90Kg     R$ 6.80Kg
Picanha               R$ 6.90Kg     R$ 7.80Kg

To serve all customers, each customer may take only one type of meat from the promotion, but there are no limits on the amount of meat per customer. If the purchase is made on the Tabajara card, the customer will also receive a 5% discount on the total purchase. Write a program that asks for the type and quantity of meat purchased by the user and generates a tax coupon, containing the purchase information: type and quantity of meat, total price, type of payment, discount amount and amount payable.
*/
import java.util.Scanner;

class EstruturaDeDecisaoExercise028 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.println("---------------------------------------------");
    System.out.println("            TABAJARA SUPERMARKET          ");
    System.out.println("                  OFFER                  ");
    System.out.println("---------------------------------------------");
    System.out.println("COD.   MEAT(kg)      UP TO 5KG       ABOVE 5KG");
    System.out.println("---------------------------------------------");
    System.out.println("001    Double File      R$4.90          R$5.80");
    System.out.println("002    Rump         R$5.90          R$6.80");
    System.out.println("003    Picanha         R$6.90          R$7.80");
    System.out.println("---------------------------------------------");
    
    System.out.println();
    
    System.out.print("Meat: ");
    int meat = scan.nextInt();

    System.out.print("Amount of meat kg: ");
    double amountMeat = scan.nextDouble();

    double price = 0;
    String typeOfMeat = " ";

    if (meat == 001) {
      typeOfMeat = "Double File";
      if (amountMeat <= 5) {
        price = 4.9;
      } else {
        price = 5.8;
      } 
    } else if (meat == 002) {
      typeOfMeat = "Rump";
      if (amountMeat <= 5) {
        price = 5.9;
      } else {
        price = 6.8;
      }
    } else if (meat == 003) {
      typeOfMeat = "Picanha";
      if (amountMeat <= 5) {
        price = 6.9;
      } else {
        price = 7.8;
      }
    } else {
      System.out.println("INVALID CODIGO!");
    }

    double totalPriceWithDiscount = amountMeat * price;

    System.out.println();

    System.out.println("---------------------------------------------");
    System.out.println("           CHOICE FORM OF PAYMENT          ");
    System.out.println("---------------------------------------------");
    System.out.println("             [1] - Tabajara Card          ");
    System.out.println("             [2] - Débit Card             ");
    System.out.println("             [3] - Crédit Card            ");
    System.out.println("---------------------------------------------");
    System.out.print("Form of payment R$: ");
    int formPayment = scan.nextInt();

    double discount = 0;
    double valueDiscount = 0;
    double totalPrice = totalPriceWithDiscount;

    if (formPayment == 1) {
      discount = 0.05;
      valueDiscount = totalPriceWithDiscount*discount;
      totalPrice = totalPriceWithDiscount-valueDiscount;
    }

    String typeOfPayment = " ";
    switch(formPayment) {
      case 1: typeOfPayment = "Tabajara Card"; break;
      case 2: typeOfPayment = "Débit Card"; break;
      case 3: typeOfPayment = "Crédit Card"; break;
      default: System.out.println("INVALID TYPE PAYMENT!");
    }

    System.out.println();
    System.out.println("---------------------------------------------");
    System.out.println("                    COUPON          ");
    System.out.println("---------------------------------------------");
    System.out.println("Meat..............................." + typeOfMeat);
    System.out.println("Amount of Meat..........................." + amountMeat+"kg");
    System.out.println("Total Price .............................R$" + totalPriceWithDiscount);
    System.out.println("Form of Payment ................." + typeOfPayment);
    System.out.println("Discount ..............................R$" + discount);
    System.out.println("Total Price ............................R$" + totalPrice);
    System.out.println("---------------------------------------------");
    System.out.println("***************CHECK BACK OFTEN**************");
  }
   

}
