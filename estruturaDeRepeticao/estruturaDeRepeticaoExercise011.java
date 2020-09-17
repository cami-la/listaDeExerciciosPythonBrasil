//Make a program that receives two whole numbers and generates sum the whole numbers that are in the range they understand.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise011 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Type the first number: ");
    int first = scan.nextInt();
    
    System.out.print("Type the last number: ");
    int last = scan.nextInt();

    int sum = 0;

    if (first < last) {
      for (int i = first+1; i < last; i++) {
        sum += i;
      }
    } else if (first > last) {
      for (int i = first-1; i > last; i--) {
        sum += i;
      }
    }
    System.out.println("The sum of numbers between "+ first + " and " + last + " is " + sum);
  }
}
