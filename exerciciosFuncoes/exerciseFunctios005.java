/*Make a program with a function called sumImposto. The function has two formal parameters: tax rate, which is the amount of sales tax expressed as a percentage and cost, which is the cost of an item before tax. The function “changes” the cost amount to include sales tax.*/
import java.util.Scanner;

class ExerciseFunctions005 {
	
	public double sumTax (double taxRate, double cost) {
		return cost + (cost * taxRate/100);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ExerciseFunctions005 e = new ExerciseFunctions005();
		
		System.out.println("Enter the cost: ");
		double cost = scan.nextDouble();
		
		System.out.println("Enter the tax rate: ");
		double taxRate = scan.nextDouble();
		
		System.out.println(e.sumTax(taxRate, cost));
	}
}

