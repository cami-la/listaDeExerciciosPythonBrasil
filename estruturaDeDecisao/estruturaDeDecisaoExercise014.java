/*Make a program that reads the two partial grades obtained by a student in a subject over the course of a semester, and calculates their average. The assignment of concepts follows the table below:

      Average Utilization Concept
      Between 9.0 and 10.0    A
      Between 7.5 and 9.0     B
      Between 6.0 and 7.5     C
      Between 4.0 and 6.0     D
      Between 4.0 and zero    E

The algorithm must show on the screen the grades, the average, the corresponding concept and the message “APPROVED” if the concept is A, B or C or “FAILED” if the concept is D or E.      
*/      
import java.util.Scanner;

class EstruturaDeDecisaoExercise014 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Type the first note: ");
    double note1 = scan.nextDouble();

    System.out.print("Type the second note: ");
    double note2 = scan.nextDouble();

    double avarege = (note1+note2)/2;
    String concept = " ";

    if (avarege <= 4){
      concept = "E";
    } else if (avarege <= 6) {
      concept = "D";
    } else if (avarege <= 7.5) {
      concept = "C";
    } else if (avarege <= 9) {
      concept = "B";
    } else if (avarege >= 9) {
      concept = "A";
    }

    System.out.println();
    System.out.println("--------------------"); 
    System.out.println("       NOTES        ");
    System.out.println("--------------------");
    System.out.println("NOTE1............" + note1);
    System.out.println("NOTE2............" + note2);
    System.out.println("--------------------");
    System.out.println("AVAREGE.........." + avarege);
    switch(concept){
      case "A":
      case "B":
      case "C": System.out.println("   >> APPROVED! <<   "); break;
      case "D":
      case "E": System.out.println("   >> FAILED! <<   "); break;
      default: System.out.println("Invalid Concept!");
    }

    
  }
}
