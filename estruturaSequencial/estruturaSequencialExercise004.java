//Make a program that asks for the 4 bimonthly notes and shows the average.
import java.util.Scanner;

class EstruturaSequencialExercise004 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Type the first note: ");
    double note1 = scan.nextDouble();
    System.out.print("Type the seccond note: ");
    double note2 = scan.nextDouble();
    System.out.print("Type the thirth note: ");
    double note3 = scan.nextDouble();
    System.out.print("Type the fourth note: ");
    double note4 = scan.nextDouble();

    double average = (note1+note2+note3+note4)/4;
    System.out.println("The average of notes entered is: " + average);
  }
}
