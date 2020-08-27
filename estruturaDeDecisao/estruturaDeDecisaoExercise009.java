//Make a program that reads three numbers and shows them in descending order.
import java.util.Scanner;

class EstruturaDeDecisaoExercise009 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter the first number: ");
    int number1 = scan.nextInt();

    System.out.print("Enter the second number: ");
    int number2 = scan.nextInt();

    System.out.print("Enter the thirth number: ");
    int number3 = scan.nextInt();

    //number1 (smaller) number3 (bigger)
    if (number1 < number2 && number1 < number3 &&       number2 < number3) {
        System.out.println(number3 + " - " + number2 + " - " + number1);
    //number1 (bigger) number3 (smaller)    
    } else if (number1 > number2 && number1 >                  number3 && number2 > number3) {
        System.out.println(number1 + " - " + number2 + " - " + number3);
    //number2 (smaller) number1(bigger)    
    } else if (number2 < number3 && number2 <                  number1 && number1 > number3) {
        System.out.println(number1 + " - " + number3 + " - " + number2);
    //number2 (bigger) number1(smaller)  
    } else if (number2 > number3 && number2 >                  number1 && number1 < number3) {
        System.out.println(number2 + " - " + number3 + " - " + number1);
    //number2(bigger) number3(smaller)        
    } else if (number2 > number3 && number2 >                  number1 && number3 < number1) {
        System.out.println(number2 + " - " + number1 + " - " + number3);   
    //number3(bigger) number2(smaller)        
    } else if (number3 > number2 && number3 >                  number1 && number2 < number1) {
        System.out.println(number3 + " - " + number1 + " - " + number2);   
    }    
  }
}
