/* Make a program to reads two student notes.
The program should calculate the average per student and represent:
A) The message "Approved", if the student's average is greater than or equal to seven;
B) The message "Failed", if the student's average is less than seven;
C) The message "Very Approved", if the student's average is equal to ten.
*/
import java.util.Scanner;

class EstruturaDeDecisaoExercise005 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter the first note: ");
    double note1 = scan.nextDouble();

    System.out.print("Enter the second note: ");
    double note2 = scan.nextDouble();

    double averange = (note1+note2)/2;

    if (averange == 10) {
      System.out.println("Very Approved");
    } else if (averange >= 7) {
      System.out.println("Approved");
    } else if (averange < 7) {
      System.out.println("Failed");
    }

  }
}
