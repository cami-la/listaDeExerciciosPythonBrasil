public class Exercise11 {
	public static void main(String[] args) {
		Car meuFusca = new Car(15);
		
		System.out.println(meuFusca);
		
		meuFusca.addFuel(20);
		
		System.out.println(meuFusca);

		
		meuFusca.run(100);
		
		System.out.println(meuFusca);

		meuFusca.showFuel();

	}
	
}
