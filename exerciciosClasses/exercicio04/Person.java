class Person {
	//atributes;
	private String name;
	private int age;
	private double height;
	private double weight;
	
	//methods
	public void getOld() {
		this.setAge(this.getAge()+1);
		if (this.getAge() > 21) {
			this.setHeigth(this.getHeight() + 0.5);
		}
	}
	
	public void fatten(double weight) {
		this.setWeight(this.getWeight() + weight);
	}
	
	public void loseWeight(double weight) {
		this.setWeight(this.getWeight() - weight);
	}
	
	
	//methods speciais
	public Person(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	private String getName() {
		return this.name;
	}
		
	private void setName(String name) {
		this.name = name;
	}
		
	private int getAge() {
		return this.age;
	}
		
	private void setAge(int age) {
		this.age = age;
	}
		
	private double getHeight() {
		return this.height;
	}
		
	private void setHeigth(double height) {
		this.height = height;
	}
		
	private void setWeight(double weight) {
		this.weight = weight;
	}
	
	private double getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		return "Person [Name : " + this.getName() + ", Age: " + this.getAge() + ", Weight: " + this.getWeight() +
		", Heigth: " + this.getHeight() + "]";
	}

}
