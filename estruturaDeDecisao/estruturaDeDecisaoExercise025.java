/*

Make a program that asks a person 5 questions about a crime. The questions are:
"Did you call the victim?"
"Were you at the crime scene?"
"Do you live near the victim?"
"Should it be for the victim?"
"Have you worked with the victim?" The program must ultimately issue a rating on the person's participation in the crime. If the person responds positively to 2 questions he should be classified as "Suspect", between 3 and 4 as "Accomplice" and 5 as "Assassin". Otherwise, he will be classified as "Innocent".
*/
import java.util.Scanner;

class EstruturaDeDecisaoExercise025 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    int count = 0;

    System.out.print("Did you call the victim? [Y/N] ");
    String call = scan.next();

    if (call.equalsIgnoreCase("y")) {
      count += 1;
    }

    System.out.print("Were you at the crime scene? [Y/N] ");
    String stay = scan.next();

    if (stay.equalsIgnoreCase("y")) {
      count += 1;
    }

    System.out.print("Did you live close to the victim? [Y/N] ");
    String live = scan.next();

    if (live.equalsIgnoreCase("y")) {
      count += 1;
    }

    System.out.print("Did you owe victim money? [Y/N] ");
    String owe = scan.next();

    if (owe.equalsIgnoreCase("y")) {
      count += 1;
    }

    System.out.print("Did you work with the victim? [Y/N] ");
    String work = scan.next();

    if (work.equalsIgnoreCase("y")) {
      count += 1;
    }

    if (count == 2) {
      System.out.println("Suspect");
    } else if (count == 3 || count == 4) {
      System.out.println("Accomplice");
    } else if (count == 5) {
      System.out.println("Killer");
    } else {
      System.out.println("blameless");
    }
  }
}
