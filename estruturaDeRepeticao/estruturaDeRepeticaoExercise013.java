// Make a program that asks for two numbers, base and exponent, calculate and show the first number raised to the second number. Do not use the language power function.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise013 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Number 1: ");
    int number1 = scan.nextInt();
    
    System.out.print("Number 2: ");
    int number2 = scan.nextInt();

    int pow = 1;
    
    for (int count = 1; count <= number2; count++) {
      pow *= number1; 
    }

    System.out.println(pow);
  }
}
