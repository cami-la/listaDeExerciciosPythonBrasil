//Change the factorial calculation program, allowing the user to calculate the factorial several times and limiting the factorial to positive integers less than 16.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise020 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    int number;
    int fatorial = 1;
    boolean toContinue = false;

    while(!toContinue) {
      System.out.print("Type a number to factorial: ");
      number = scan.nextInt();

      if (number > 0 && number < 16) {
        System.out.print(number + "! = ");
        for (int i = number; i >= 1; i--) {
         System.out.print(i + " ");
         fatorial *= i;
        }
      System.out.println("= " + fatorial);
      fatorial = 1;
      System.out.println();
      } else {
        System.out.println("Invalid Input!");
        System.out.println();
      }

      System.out.print("Do you want to continue? ");
      String yesContinue = scan.next();
      System.out.println();
      if (yesContinue.equalsIgnoreCase("n")){
        toContinue = true;
      }
    }
    System.out.println("See you later!");
  }

}

