public class Exercise12 {

	public static void main(String[] args) {
		InvestimentAccount contaPoupanca = new InvestimentAccount(123, "Camila", 10, 1000);
		/*InvestimentAccount contaPoupanca2 = new InvestimentAccount(123, "Case", 10, 1000);
		
		System.out.println(contaPoupanca.equals(contaPoupanca2));
		*/
		System.out.println(contaPoupanca);
		
		contaPoupanca.increaseInterestRate();
		contaPoupanca.increaseInterestRate();
		contaPoupanca.increaseInterestRate();
		contaPoupanca.increaseInterestRate();
		contaPoupanca.increaseInterestRate();
		
		System.out.println();
		System.out.println(contaPoupanca);

	}

}
