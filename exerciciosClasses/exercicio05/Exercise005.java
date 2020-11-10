class Exercise005 {

	public static void main(String[] args) {
		CheckingAccount account1 = new CheckingAccount(123, "Camila Cavalcante");
		account1.deposit(50);
		System.out.println(account1);
		account1.withDraw(10);
		System.out.println(account1);
		account1.changeName("Juliana");
		System.out.println(account1);
		account1.withDraw(100);	
	}
}

