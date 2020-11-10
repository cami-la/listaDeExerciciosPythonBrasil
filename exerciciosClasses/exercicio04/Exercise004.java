class Exercise004 {

	public static void main(String[] args) {
		Person camila = new Person("Camila", 26, 63.0, 171);
		System.out.println(camila);
		camila.getOld();
		camila.loseWeight(2);
		System.out.println(camila + "\n");

		
		Person julia = new Person("Julia", 25, 65.0, 163);
		System.out.println(julia);
		julia.getOld();
		julia.fatten(1);
		System.out.println(julia + "\n");
	}

}

