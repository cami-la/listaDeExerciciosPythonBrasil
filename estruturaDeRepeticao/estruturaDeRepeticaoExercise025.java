// Make a program that asks n people your age, at the end the program should check if the average age of the class varies between 0 and 25.26 and 60 and greater than 60; and then, say if the class is young, adult or elderly, according to the calculated average.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise025 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    int age;
    int count = 0;
    int sum = 0;
    boolean stop = false;

    while(!stop) {
      System.out.print("Type the age: ");
      age = scan.nextInt();

      sum += age;
      count += 1;

      System.out.print("Do you want to add more ages? [Y/N] ");
      String toContinue = scan.next();

      if (toContinue.equalsIgnoreCase("n")) {
        stop = true;
      }
    }

    double avanger = sum/count;
    String situation;

    if (avanger < 25.26) {
      situation = "young";
    } else if (avanger <= 60) {
      situation = "adult";
    } else {
      situation = "elderly";
    }
    System.out.println("The average age of the class is " + avanger + " therefore is " + situation + ".");
  }
}
