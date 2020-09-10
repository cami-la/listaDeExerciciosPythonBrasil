/* Make a program that reads and validates the following information:
Name: greater than 3 characters;
Age: between 0 and 150;
Salary: greater than zero;
Gender: 'f' or 'm';
Civil Status: 's', 'c', 'v', 'd';
*/
import java.util.Scanner;

class EstruturaDeRepeticaoExercise003 {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println();

    String name;
    int age;
    double salary;
    String gender;
    String matiralCivil;

    do {
      System.out.print("Name: ");
      name = scan.next();
     } while (name.length() <= 3);

    do {
      System.out.print("age: ");
      age = scan.nextInt();
    } while (age < 0 && age > 150);

    do {
      System.out.print("salary: ");
      salary = scan.nextDouble();
    } while (salary < 0);

    do {
      System.out.print("gender: ");
      gender = scan.next();
    } while (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("w"));

    do {
      System.out.print("matiralCivil: ");
      matiralCivil = scan.next();
    } while (!matiralCivil.equalsIgnoreCase("s") &&
             !matiralCivil.equalsIgnoreCase("c") &&
             !matiralCivil.equalsIgnoreCase("v") &&
             !matiralCivil.equalsIgnoreCase("d"));

  }
}
