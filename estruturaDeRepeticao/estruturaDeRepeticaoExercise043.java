/*The menu of a snack bar is as follows:

    Specification 	Code 	Price
    Hot Dog 		100 	R$1.20
    Bauru Simples 	101 	R$1.30
    Bauru with egg 	102 	R$1.50
    Hamburger 		103 	R$1.20
    Cheeseburger 	104 	R$1.30
    Soda 			105 	R$1.00

    Make a program that reads the code of the ordered items and the desired quantities. 
    Calculate and show the amount to be paid per item (price * quantity) and the grand total of the order. 
    Consider that the customer must inform when the order should be closed.
 */
import java.util.Scanner;

class EstruturaDeRepeticaoExercise043 {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.println();
		
		double sum = 0;
		int cod;
		boolean stop = false;
		
		double hotDog = 1.20;
		double bauruSimple = 1.3;
		double bauruWithEgg = 1.5;
		double hamburguer = 1.2;
		double cheeseburguer = 1.3;
		double soda = 1.0;
		double count = 0;
		
		while(!stop) {
			System.out.print("Enter a cod.: ");
			cod = scan.nextInt();
			if (cod == 0) {
				stop = true;					
			} else if (cod == 100) {
				count = hotDog;
				sum += count;
				System.out.println("Add Hot Dog R$" + count);
			} else if (cod == 101) {
				count = bauruSimple;
				sum += count;
				System.out.println("Bauru Simple R$" + count);
			} else if (cod == 102) {
				count = bauruWithEgg;
				sum += count;
				System.out.println("Bauru with egg R$" + count);
			} else if (cod == 103) {
				count = hamburguer;
				sum += count;
				System.out.println("Hamburger R$" + count);
			} else if (cod == 104) {
				count = cheeseburguer;
				sum += count;
				System.out.println("Cheeseburger R$" + count);
			} else if (cod == 105) {
				count = soda;
				sum += count;
				System.out.println("Soda R$" +count);
			}
			
		}
		System.out.println("Total: R$" + sum);
	}
}

