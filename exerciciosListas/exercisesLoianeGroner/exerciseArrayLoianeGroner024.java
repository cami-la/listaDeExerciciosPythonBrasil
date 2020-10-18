//Palindromic numbers are those that are written from right to left have the same value when written from left to right. Example: 545; 789987; 97379; 123454321; etc. Write a program that checks whether a given vector A of 10 whole elements is a palindrome, that is, whether the first element of the vector is equal to the last, whether the second element of the vector is equal to the penultimate, and so on until all elements or come to the conclusion that the vector is not a palindrome.
import java.util.Scanner;

class ExerciseArrayLoianeGroner024{
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);

    int[] arrayA = new int[10];

    for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Enter the number: ");
      arrayA[i] = scan.nextInt(); 
    }

    boolean palidromo = true;
    for (int i = 0; i < arrayA.length; i++) {
      if (arrayA[i] != arrayA[(arrayA.length/2) - 1 - i]) {
        palidromo = false;
        break;
      }
    }
    
    if (palidromo) {
      System.out.println("The ArrayA is palindrome.");
    } else{
      System.out.println("The ArrayA isn't palindrome.");
    }
    }
}
