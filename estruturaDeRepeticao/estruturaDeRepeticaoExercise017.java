//Make a program that calculates the factorial of an integer provided by the user. Ex .: 5! = 5.4.3.2.1 = 120
import java.util.Scanner;

class EstruturaDeRepeticaoExercise017 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter with number to factorial: ");
    int number = scan.nextInt();
    int fatorial = 1;

    System.out.print(number + "! = ");
    for (int i = number; i >= 1; i--) {
      if (i != 1) {
        System.out.print(i + "x");
      } else {
        System.out.print(i + " ");
      }
      fatorial *= i;
    }
    System.out.println("= " + fatorial);
  }
}
