class Exercise001 {

	public static void main(String[] args) {
		Boll bola1 = new Boll("blue", 70, "Plastic");
		
		bola1.displayColor();
		bola1.changeColor("red");
		
		System.out.println(bola1);
		
		bola1.changeColor("yellow");
		bola1.displayColor();
		
		System.out.println(bola1);
		
	}

}

