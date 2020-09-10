/* Assuming that the population of country A is of the order of 80,000 inhabitants with an annual growth rate of 3% and that the population of B is 200,000 inhabitants with a growth rate of 1.5%. Make a program that calculates and writes the number of years needed for the population of country A to exceed or equal the population of country B, while maintaining growth rates.
Change the previous program allowing the user to inform the initial populations and growth rates. Validate the entry and allow the operation to be repeated.
*/
import java.util.Scanner;

class EstruturaDeRepeticaoExercise005 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    boolean toContinue = false;
    int count = 0;

    while(!toContinue) {
       
      System.out.print("Inhabitants country A: ");
      double inhabitantsA = scan.nextDouble();
      double rateA = (1+0.03);
      
      System.out.print("Inhabitants country B: ");
      double inhabitantsB = scan.nextDouble();
      double rateB = (1+0.015);
      
      do {
        count++; 
        inhabitantsA *= rateA;
        inhabitantsB *= rateB;
      } while (inhabitantsA < inhabitantsB); 
          
      System.out.println("inhabitantsA = " + inhabitantsA);
      System.out.println("inhabitantsB = " + inhabitantsB);
      System.out.println("The inhabitantsA is equal or bigger than inhabitantsB in " + count + " years.");

      System.out.println();  
      System.out.print("Do you want to continue? [Y/N] ");
      String repeat = scan.next();
        
      if (repeat.equalsIgnoreCase("n")) {
        toContinue = true;
      }    
    }          
  }
}  

