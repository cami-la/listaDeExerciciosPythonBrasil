//Make a program that asks for a note, between zero and ten. Show a message if the value is invalid and keep asking until the user enters a valid value.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise001 {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println();

    double note = 0;

    do {
      System.out.print("Type a note between 0 and 10: ");
      note = scan.nextInt();
    } while(note < 0 || note > 10);
    System.out.println("This note was " + note);

    /*
    while(true) {
      System.out.print("Type a note between 0 and 10: ");
      double note = scan.nextInt();

      if (note < 0 || note > 10){
        continue;
      } else {
        System.out.println("This note was " + note);
        break;
      }  
    } 
    */     
  }
}
