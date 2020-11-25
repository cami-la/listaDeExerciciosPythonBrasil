public class CheckingAccount {
	//atributes
	protected int numberAccount;
	protected String name;
	protected double balance;
	
	
	//methods
	public void changeName(String name) {
		this.setName(name);
	}
	
	public void deposit(double value) {
		this.setBalance(value);
	}
	
	public void withDraw(double value) {
		if (this.getBalance() > 0 && this.getBalance() >= value) {
			this.setBalance(getBalance() - value); 
		} else {
			System.out.println("It was not possible to withdraw");
		}
	}

	//special methods 
		public CheckingAccount(int numberAccount, String name) {
			this.numberAccount = numberAccount;
			this.name = name;
			this.balance = 0;
		}
		

		protected int getNumberAccount() {
			return this.numberAccount;
		}
		
		protected void setBalance(double value) {
			this.balance = value;
		}

		protected double getBalance() {
			return this.balance;
		}
		
		protected void setName(String newName) {
			this.name = newName;
		}
		
		protected String getName() {
			return this.name;
		}
		
		
		@Override
		public String toString() {
			return "Checking Account: [" + "Name:" + this.getName() + ", Account Number: " + this.getNumberAccount() + ", Balance: " + this.getBalance() + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof CheckingAccount) {
				CheckingAccount any = (CheckingAccount) obj;
				return this.numberAccount == any.getNumberAccount();
			} else {
				return false;
			}
		}
		
}

