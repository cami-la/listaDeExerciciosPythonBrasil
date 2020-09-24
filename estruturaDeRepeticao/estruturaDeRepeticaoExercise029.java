/* Mr. Manoel Joaquim has a large R $ 1.99 article store, with about 10 boxes. To speed up the calculation of how much each customer must pay, he developed a table that contains the number of items the customer bought and beside the bill amount. This way, the cashier's attendant only needs to count how many items the customer is taking and look at the price list. You were hired to develop the program that assembles this price list, which will contain the prices of 1 to 50 products, as shown in the example below:

    Almost Two Stores - Price list
    1 - R $ 1.99
    2 - R $ 3.98
    ...
    50 - R $ 99.50
*/

class EstruturaDeRepeticaoExercise029 {
  public static void main(String[] args) {
    System.out.println();
    double standardPrice = 1.99;

    System.out.println("------------------------------");
    System.out.println("Almost Two Stores - Price list");
    for (int i = 1; i <= 50; i++) {
      System.out.println(i + " - " + "R$" + (standardPrice*i));
    }
    System.out.println("------------------------------");

  }
}
