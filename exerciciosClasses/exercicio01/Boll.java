class Boll {
	//atributes
	private String color;
	private double circle;
	private String material;
	
	
	public void changeColor(String newColor) {
		this.setColor(newColor);
	}
	
	public void displayColor() {
		System.out.println(this.getColor());
	}
	
	//special methods
	public Boll(String color, double circle, String material) {
		this.color = color;
		this.circle = circle;
		this.material = material;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getCircle() {
		return this.circle;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	@Override
	public String toString() {
		return "Boll: [Color = " + this.getColor() +
				", Circle = " + this.getCircle() +  
				", Material = " + this.getMaterial() +"]";
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}

