class Exercise010 {

	public static void main(String[] args) {
		BombaCombustivel b1 = new BombaCombustivel("Gasoline");
		BombaCombustivel b2 = new BombaCombustivel("gasoline");
		BombaCombustivel b3 = new BombaCombustivel("GNV");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		b1.supplyForValue(100.0);
		b2.supplyForValue(100.0);
		b3.supplyForValue(100.0);
		
		System.out.println();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		b1.supplyForLiter(5);
		b2.supplyForLiter(5);
		b3.supplyForLiter(5);
		
		System.out.println();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		b1.changeTypeFuel("diesel");
		b2.changeTypeFuel("gasoline");
		b3.changeTypeFuel("gnv");
		
		System.out.println();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		b1.changeValueFuel(4.5);
		b2.changeValueFuel(5.5);
		b3.changeValueFuel(6.5);
		
		System.out.println();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		b1.changeTypeFuel("alcohol");
		b2.changeTypeFuel("gnv");
		b3.changeTypeFuel("gasoline");
		
		System.out.println();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		System.out.println(b1.equals(b2));
	}
}

