// Fibonacci series is formed by the sequence 1,1,2,3,5,8,13,21,34,55, ... Make a program capable of generating the series up to the nth term.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise015 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter the nth term of the fibonacci sequence: ");
    int n = scan.nextInt();
    int first = 1;
    int second = 1;
    int next;

    System.out.print(first + " ");
    System.out.print(second + " ");

    for (int i = 3; i <= n; i++) {
      next = first + second;
      first = second;
      second = next;

      System.out.print(next + " ");
    }
    System.out.println();    
  }
}
