/*Faça um programa que use a função valorPagamento para determinar o valor a ser pago por uma prestação de uma conta. O programa deve solicitar ao usuário o valor da prestação e o número de dias em atraso e passar estes valores para a função valorPagamento, que calculará o valor a ser pago e devolverá este valor ao programa que a chamou. O programa deve exibir o valor a ser pago na tela. Após a execução o programa deve voltar a pedir outro valor de prestação e assim continuar até que seja informado um valor igual a zero para a prestação. Neste momento o programa deve ser encerrado, exibindo o relatório do dia, que conterá a quantidade e o valor total de prestações pagas no dia. O cálculo do valor a ser pago é feito da seguinte forma. Para pagamentos sem atraso, cobrar o valor da prestação. Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.*/
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class ExerciseFunctions007 {
	public double valuePayment(double value, double daysDelay) {
		if (daysDelay > 0) {
			value += value*0.03 + (value*0.01*daysDelay);   
		}
		return value;		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date actualDate = new Date();
		ExerciseFunctions007 e = new ExerciseFunctions007();
		List<Double> payments = new LinkedList<Double>();
		
		double sumPayments = 0;
		while(true) {
			System.out.print("Installment value: R$");
			double installment = scan.nextDouble();
			
			if (installment == 0) {
				break;
			} else {
				System.out.print("Days delay: ");
				double daysDelay = scan.nextDouble();
				
				double value = e.valuePayment(installment, daysDelay);
				
				payments.add(value);
				sumPayments += value;
			}
			
		}
		System.out.println("\n" + actualDate.toString());
		System.out.println("Amount of payment - Total");
		System.out.printf(Locale.US,"%17d - R$%.2f",payments.size(), sumPayments);
	}

}

