class Exercise008 {
	public static void main(String[] args) {
		Monkey monkey1 = new Monkey("Cami");
		Monkey monkey2 = new Monkey("Case");
		
		monkey1.seeStomach();
		monkey1.toEat("banana");
		monkey1.seeStomach();
		monkey1.toEat("orange");
		monkey1.seeStomach();
		monkey1.toEat("apple");
		monkey1.seeStomach();
		monkey1.toDigest("apple");
		monkey1.seeStomach();
		monkey1.toDigest("orange");
		monkey1.seeStomach();
		monkey1.toDigest("banana");
		monkey1.seeStomach();
		System.out.println("----");
		
		monkey2.toEat(monkey1);
		monkey2.seeStomach();		
	}
}

