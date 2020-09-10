//Make a program that reads a username and password and does not accept the same password as the username, showing an error message and asking for the information again.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise002 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    boolean validInput = false;
    String user;
    String password;

    do {
      System.out.print("User: ");
      user = scan.next();

      System.out.print("Password: ");
      password = scan.next();

      if (password.equalsIgnoreCase(user)) {
        System.out.println("Invalid Password! Try again.");
      } else {
        validInput = true;
        System.out.println("Welcome, " + user);  
      }
    } while(!validInput);    
    
  }
}
