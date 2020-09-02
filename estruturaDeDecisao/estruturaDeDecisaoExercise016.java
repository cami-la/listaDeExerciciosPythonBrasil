/*Run a program that calculates the roots of a second degree equation, in the form ax2 + bx + c. The program should ask for the values ​​of a, b and c and make the consistencies, informing the user in the following situations:

    If the user informs the value of A equal to zero, the equation is not of the second degree and the program should not ask for the other values, being closed;
    If the calculated delta is negative, the equation has no real roots. Inform the user and close the program;
    If the calculated delta is equal to zero, the equation has only one real root; inform the user;
    If the delta is positive, the equation has two real roots; inform the user;
*/
import java.util.Scanner;

class EstruturaDeDecisaoExercise016 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter the a: ");
    int a = scan.nextInt();

    if (a == 0) {
      System.out.println("it's not a second degree equation.");
    } else {
      System.out.print("Enter the b: ");
      int b = scan.nextInt();

      System.out.print("Enter the c: ");
      int c = scan.nextInt();

      double delta = Math.pow(b,2) - (4 * a * c);

    if (delta < 0) {
      System.out.println("This equation don't has real roots - negative delta.");
    } else {
        System.out.println("Delta: " + delta);
        double x1 = ((-b) + Math.sqrt(delta))/(2*a);
        double x2 = ((-b) - Math.sqrt(delta))/(2*a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
      }
    }    
  }
}
