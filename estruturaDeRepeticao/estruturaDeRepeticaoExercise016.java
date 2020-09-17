//The Fibonacci series is formed by the sequence 0,1,1,2,3,5,8,13,21,34,55, ... Make a program that manages the series until the value is greater than 500.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise016 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    int first = 0; 
    int second = 1;
    int next = 0;

    System.out.print(first + " ");
    System.out.print(second + " ");
  
    while(next < 500) {
      next = first + second;
      first = second;
      second = next;
      System.out.print(next + " ");
    }
    System.out.println();
  }
}
