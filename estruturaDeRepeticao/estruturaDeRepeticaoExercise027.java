// Make a program that calculates the average number of students per class. For this, ask for the number of classes and the number of students for each class. Classes cannot have more than 40 students.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise027 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter the number of classes: ");
    int classes = scan.nextInt();

    int student;
    int sum = 0;

    for (int i= 0; i < classes; i++) {
      System.out.print("Enter the numbers of student " + (i+1) + "º class: ");
      student = scan.nextInt();

      while (student > 40) {
        System.out.print("INVALID CLASS!");
        System.out.print("Enter with the student of " + (i+1) + "º class: ");
        student = scan.nextInt();
      }
      System.out.println();
      sum += student;
    }

    double avanger = sum/classes;
    System.out.println("The avanger of student by class: " + avanger);

  }
}
