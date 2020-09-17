// Change the previous program so that it only accepts numbers between 0 and 1000.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise019 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    int biggest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    int sum = 0;
    
    int number;

    boolean toContinue = false;
    while(!toContinue) {
      System.out.print("Type a number: ");
        number = scan.nextInt();

      while(number < 0 || number > 1000) {
        System.out.println("Invalid Number! Try again!");
        System.out.print("Type a number: ");
        number = scan.nextInt();
      } 

      if (number > biggest) {
        biggest = number;
      } else if (number < smallest) {
        smallest = number;
      }
      sum += number;

      System.out.print("Do you want to continue? [Y/N] ");
      String yesContinue = scan.next();
      if (yesContinue.equalsIgnoreCase("n")) {
        toContinue = true;    
      }

    }
    System.out.println("Biggest number: " + biggest);
    System.out.println("Smallest number: " + smallest);
    System.out.println("Sum numbers: " + sum);  
  }
}
