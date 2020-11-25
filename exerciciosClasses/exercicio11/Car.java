import java.util.Locale;

public class Car {
	//atributes
	private double consumption;
	private double amountFuel;
	
	
	public void run(double km) {
		double consumptionTotal = km/this.getConsuption();
		this.amountFuel -= consumptionTotal;
	}
	
	public void showFuel() {
		System.out.printf(Locale.US, "There are %.2f liters of fuel", this.getAmountFuel());
	}
	
	public void addFuel(double fuel) {
		this.setAmountFuel(fuel);
	}
	
	//special methods
	public Car (double consumptionTotal) {
		this.amountFuel = 0;
		this.consumption = consumptionTotal;
	}
	
	private double getConsuption() {
		return this.consumption;
	}
	
	private double getAmountFuel() {
		return this.amountFuel;
	}
	
	private void setAmountFuel(Double fuel) {
		this.amountFuel += fuel;
	}

	@Override
	public String toString() {
		return "Car: Consumption = " + this.getConsuption() + "km/L - Amount Fuel = " + this.getAmountFuel() + "L";
	}
	
}
