class CheckingAccount {
	//atributes
	private int numberAccount;
	private String name;
	private double balance;
	
	
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
		

		private int getNumberAccount() {
			return this.numberAccount;
		}
		
		private void setBalance(double value) {
			this.balance = value;
		}

		private double getBalance() {
			return this.balance;
		}
		
		private void setName(String newName) {
			this.name = newName;
		}
		
		private String getName() {
			return this.name;
		}
		
		
		@Override
		public String toString() {
			return "Checking Account: [" + "Name:" + this.getName() + ", Account Number: " + this.getNumberAccount() + ", Balance: " + this.getBalance() + "]";
		}
		
}
