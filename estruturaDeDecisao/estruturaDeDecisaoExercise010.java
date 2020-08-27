//Make a Program that asks in which shift you study. Ask to type M-morning or A-Afternoon or N-Night. Print the message "Good morning!", "Good afternoon!" or good night!" or "Invalid Value!", as appropriate.
import java.util.Scanner;

class EstruturaDeDecisaoExercise010 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.println("M - Morning | A - Afternoon | N - Night");
    
    System.out.print("Wich shift do you study? ");
    String shift = scan.next();

    if (shift.length() > 1) {
      System.out.println("Enter a unique letter");
    } else {
      switch(shift) {
        case "M": 
        case "m": System.out.println("Good Morning!"); break;
        case "A": 
        case "a": System.out.println("Good Afternoon!"); break;
        case "N": 
        case "n": System.out.println("Good Evening!"); break;
        default: System.out.println("Invalid Value!");
      }
    }  
  }
}
