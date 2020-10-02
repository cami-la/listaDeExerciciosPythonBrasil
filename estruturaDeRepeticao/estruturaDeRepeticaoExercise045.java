/*
Develop a program to check the student's grade in a test with 10 questions, the program should ask the student the answer to each question and at the end compare with the test template and thus calculate the total number of correct answers and the grade (assign 1 point for the right answer). After each student uses the system, a question should be asked if another student will use the system. After all students have responded inform:

    Greater and Lesser Hit;
    Total Students who used the system;
    The Average Class Score.

    Proof Feedback:

    01 - A
    02 - B
    03 - C
    04 - D
    05 - E
    06 - E
    07 - D
    08 - C
    09 - B
    10 - A

    After completing this you could increment the program by allowing the teacher to type in the test template before students use the program.
*/
import java.util.Scanner;

class EstruturaDeRepeticaoExercise045 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    int biggestHit = Integer.MIN_VALUE;
    int shortestHit = Integer.MAX_VALUE;
    int studentCod;
    int codBiggestHit =  Integer.MIN_VALUE;
    int codShortestHit = Integer.MAX_VALUE;
    int totalHits;
    String question;
    String newStudent;
    int totalStudent = 0;
    double avangerGrade = 0;
    double sumTotalHits = 0;

    while (true) {
      totalHits = 0;
      totalStudent++;

      System.out.print("Student Cod.: ");
      studentCod = scan.nextInt();
      
      System.out.println();
      System.out.println("Student Proof feedback " + studentCod);
      
      for (int i = 1; i <=10; i++) {
        System.out.print("0" + i + " - ");
        question = scan.next();

        if (i == 1 && question.equalsIgnoreCase("a")) {
          totalHits++;
        }
        if (i == 2 && question.equalsIgnoreCase("b")) {
          totalHits++;
        }
        if (i == 3 && question.equalsIgnoreCase("c")) {
          totalHits++;
        }
        if (i == 4 && question.equalsIgnoreCase("d")) {
          totalHits++;
        }
        if (i == 5 && question.equalsIgnoreCase("e")) {
          totalHits++;
        }
        if (i == 6 && question.equalsIgnoreCase("e")) {
          totalHits++;
        }
        if (i == 7 && question.equalsIgnoreCase("d")) {
          totalHits++;
        }
        if (i == 8 && question.equalsIgnoreCase("c")) {
          totalHits++;
        }
        if (i == 9 && question.equalsIgnoreCase("b")) {
          totalHits++;
        }
        if (i == 10 && question.equalsIgnoreCase("a")) {
          totalHits++;
        }
      }

      sumTotalHits += totalHits;
      
      if (totalHits > biggestHit) {
          biggestHit = totalHits;
          codBiggestHit = studentCod;
      } 

      if (totalHits < shortestHit) {
          shortestHit = totalHits;
          codShortestHit = studentCod;
      } 

      System.out.print("Regiter new student? [Y/N] ");
      newStudent = scan.next();
      if (newStudent.equalsIgnoreCase("n")) {
        break;
      }
      System.out.println();

    }
    System.out.println("----------");
    System.out.println("Total Registred Student: " + totalStudent);
    System.out.println("Biggest Hit: " + biggestHit + " Student Cód.: " + codBiggestHit);
    System.out.println("Shortest Hit: " + shortestHit + " Student Cód.: " + codShortestHit);
    System.out.println("Avanger Grade: " + (sumTotalHits/totalStudent));

  }
}
