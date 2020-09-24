/*Mr. Manoel Joaquim expanded his business beyond the 1.99 business and now has a convenience store. Make a program that implements a rudimentary cash register. The program must receive an unknown number of values ​​referring to the prices of the goods. A zero value must be provided by the operator to indicate the end of the purchase. The program must then show the total purchase and ask for the cash value the customer provided, then calculate and show the change value. After this operation, the program must return to the starting point, to register the next purchase. The output should be according to the example below:

    Shopping Tabajara
    Product 1: R $ 2.20
    Product 2: R $ 5.80
    Product 3: R $ 0
    Total: R $ 9.00
    Money: R $ 20.00
    Price: $ 11.00
    ...
*/
import java.util.Scanner;

class EstruturaDeRepeticaoExercise031 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {		
			boolean register = false;	
			double sum = 0;
			int count = 0;
			double priceOfProduct = 0;
			
			System.out.println("------------------------------");
			System.out.println("        Lojas Tabajara        ");
			System.out.println("------------------------------");
	
			while(!register) {
				System.out.print("Product " + (count+1) + ": R$ ");
				priceOfProduct = scan.nextDouble();
				
				if (priceOfProduct == 0) {
					register = true;
				} else {
					count++;
					sum += priceOfProduct;
				}
			}
			
			System.out.println("Total R$ " + sum);
			System.out.print("Pay: R$");
			double pay = scan.nextDouble();
			System.out.println("Change: R$ " + (pay - sum));
			
			System.out.println("------------------------------");
			System.out.println("       Check Back Often       ");
			System.out.println("------------------------------");
				
		}
	}
}
