//Make a program thats checks if a letter insered is vowel or consonant
import java.util.Scanner;

class EstruturaDeDecisaoExercise004 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter a letter: ");
    String letter = scan.next();

    if (letter.length() > 1) {
      System.out.print("Enter a unique letter!");
    } else {
      switch(letter) {
        case "a":
        case "e":
        case "i":
        case "o":
        case "u": 
        case "A":
        case "E":
        case "I":
        case "O":
        case "U": System.out.println("The letter " + letter + " is a vowel"); break;
        default: System.out.println("The letter " + letter + " is a consonant");
    }
    }
  }
}
