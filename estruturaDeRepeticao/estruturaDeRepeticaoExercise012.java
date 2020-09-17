/*and develop a multiplication table generator, capable of generating the multiplication table of any integer between 1 and 10. The user must inform which number he wants to see the multiplication table. The output should be according to the example below:
Times table of 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
import java.util.Scanner;

class EstruturaDeRepeticaoExercise012 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Type a number: ");
    int number = scan.nextInt();
    
    System.out.println();
    System.out.println("Multiplication of " + number + ":");
    for(int i = 1; i <= 10; i++) {
      System.out.println(number + " x " + i + " = " +  (i*number));
    }
  }
}
