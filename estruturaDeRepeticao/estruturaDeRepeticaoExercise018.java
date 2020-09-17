// Make a program that, given a set of N numbers, determines the smallest value, the largest value and the sum of the values.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise018 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    int biggest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    int sum = 0;
    boolean toContinue = false;
    int number;

    while(!toContinue) {
      System.out.print("Type a number: ");
      number = scan.nextInt();

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
