//Make a program that reads a number and show the corresponding day of the week. (1-Sunday, 2- Monday, etc.), if you enter another value, an invalid value should appear.
import java.util.Scanner;

class EstruturaDeDecisaoExercise013 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Type the number corresponding day of the week: ");
    int dayWeek = scan.nextInt();

    switch(dayWeek) {
      case 1: System.out.println("1-Sunday"); break;
      case 2: System.out.println("2-Monday"); break;
      case 3: System.out.println("3-Tuesday"); break;
      case 4: System.out.println("4-Wenesday"); break;
      case 5: System.out.println("5-Thursday"); break;
      case 6: System.out.println("6-Friday"); break;
      case 7: System.out.println("7-Saturday"); break;
      default: System.out.println("Invalid Number"); break;
    }
  }

}
