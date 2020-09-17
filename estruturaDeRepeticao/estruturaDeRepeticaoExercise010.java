//Make a program that receives two whole numbers and generates the whole numbers that are in the range they understand.

import java.util.Scanner;

class EstruturaDeRepeticaoExercise010 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Type the first number: ");
    int first = scan.nextInt();
    
    System.out.print("Type the last number: ");
    int last = scan.nextInt();

    if (first < last) {
      for (int i = first+1; i < last; i++) {
        System.out.print(i + " ");
      }
    } else if (first > last) {
      for (int i = first-1; i > last; i--) {
        System.out.print(i + " ");
      }
      System.out.println();
    } 
  }
}
