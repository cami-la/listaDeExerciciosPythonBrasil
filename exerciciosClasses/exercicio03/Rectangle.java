class Rectangle {
	//atributes
	private double sideA;
	private double sideB;
	
	//methods
	public void changeValueSides(double sideA, double sideB) {
			this.setSideA(sideA);
			this.setSideB(sideB);
		}
	
	public double areaRectangle() {
		return this.getSideA() * this.getSideB();
	}
	
	public double perimeterRectangle() {
		return 2*this.getSideA() + 2*this.getSideB();
	}
	
	public Rectangle(double sideA, double sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	
	public double getSideA() {
		return this.sideA;
	}
	
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	
	public double getSideB() {
		return this.sideB;
	}
	
	@Override
	public String toString() {
		return "Rectangle : [Width" + this.getSideA() + "Length" + this.getSideB();
	}
}

