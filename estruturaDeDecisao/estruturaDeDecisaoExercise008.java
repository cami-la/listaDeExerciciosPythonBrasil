//Make a program that asks the price of three products and informs which was product you should buy, knowing that the decision is always the more cheap.
import java.util.Scanner;

class EstruturaDeDecisaoExercise008 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);System.out.println();

    System.out.print("Enter the price of the first product: R$");
    double product1 = scan.nextDouble();
    
    System.out.print("Enter the price of the second product: R$");
    double product2 = scan.nextDouble();
    
    System.out.print("Enter the price of the thirth product: R$");
    double product3 = scan.nextDouble();

    if (product1 <= product2 && product1 <= product3) {
      System.out.println("The first product is more cheap, can buy!");
    } else if (product2 <= product1 && product2 <= product3) {
      System.out.println("The second product is more cheap, can buy!");
    } else if (product3 <= product1 && product3 <= product2) {
      System.out.println("The thirt product is more cheap, can buy!");
    }
  }
}
