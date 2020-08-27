//Make a program that checks if an inserted letter is "W" or "M". According to the letter, he writes: W - Woman, M - Man, Invalid Sex;
import java.util.Scanner;

class EstruturaDeDecisaoExercise003 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter the gender: [W/M] ");
    String letter = scan.next();

    if (letter.equalsIgnoreCase("w")){
      System.out.println("W - Woman");
    } else if (letter.equalsIgnoreCase("m")) {
      System.out.println("M - Man");
    } else {
      System.out.println("Invalid gender!");
    }
  }
}
