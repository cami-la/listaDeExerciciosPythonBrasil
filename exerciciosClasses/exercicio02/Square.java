class Square {
	//atributes
	private double sideSize;
	
	//methods
	public void changeSideValue(double newSideSize) {
		this.setSideSize(newSideSize);
	}
	
	public double sideValue() {
		return this.getSideSize();
	}
	
	public double area() {
		return Math.pow(this.getSideSize(), 2);
	}
	
	//special methods
	public Square(double sideSize) {
		this.sideSize = sideSize;
	}
	
	private double getSideSize() {
		return this.sideSize;
	}
	
	
	private void setSideSize(double sideSize) {
		this.sideSize = sideSize;
	}

	@Override
	public String toString() {
		return "Square: [Side = " + this.getSideSize() + ", Area = " + this.area() + "]";
	}
	
}

