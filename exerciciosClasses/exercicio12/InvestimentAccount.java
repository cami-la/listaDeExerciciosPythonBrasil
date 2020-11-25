//usei herança da classe CheckingAccount do exercício 05.
import site.camila.exerciciospythonbrasil.exerciciosclasses.exercise005.CheckingAccount;

public class InvestimentAccount extends CheckingAccount {
	//atributes
	private double interestRate;
	
	//methods
	public void increaseInterestRate() {
		this.setBalance(this.getBalance() * (1+ this.getInterestRate()/100));
	}
	
	//special methods
	public InvestimentAccount(int numberAccount, String name, double interestRate, double balance) {
		super(numberAccount, name);
		this.interestRate = interestRate;
		this.balance = balance;
	}
	
	private double getInterestRate() {
		return this.interestRate;
	}
	
	@Override
	public String toString() {
		return "Investiment Account \nName: " + this.getName()  + 
				"\nNumber Account: " + this.getNumberAccount() + "\nBalance: R$" + this.getBalance() +
				"\nInterest Rate: " + this.getInterestRate() + "%"; 
	}
	
}
