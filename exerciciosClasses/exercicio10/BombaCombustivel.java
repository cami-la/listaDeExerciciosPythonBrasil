import java.util.HashSet;
import java.util.Set;

class BombaCombustivel {
	//atributes
	private String typeFuel;
	private double literValue;
	private double amountFuelTotal;
	
	
	public void supplyForValue(double value) {
		 double amountLiterSupply = value/getLiterValue();
		 System.out.printf("%.2fL\n", amountLiterSupply);
		 
		 this.setAmountFuel(amountLiterSupply);
	}
	
	public void supplyForLiter(double amountFuel) {
		 double amountToBePaid = amountFuel * getLiterValue();
		 System.out.printf("R$%.2f\n", amountToBePaid);
		 
		 this.setAmountFuel(amountFuel);
	}
	
	public void changeValueFuel(double newValueLiter) {
		if (this.getLiterValue() != newValueLiter) {
			this.setLiterValue(newValueLiter);
		} else {
			System.out.println("The same value of fuel! " + this.getLiterValue());
		}
	}
	
	public void changeTypeFuel(String newTypeFuel) {
		newTypeFuel = newTypeFuel.toLowerCase();
		Set<String> typesFuel = new HashSet<String>();
		typesFuel.add("gasoline");
		typesFuel.add("alcohol");
		typesFuel.add("gnv");
		
		if (this.typeFuel.equalsIgnoreCase(newTypeFuel)) {
			System.out.println("The same fuel! " + this.getTypeFuel().toUpperCase());
		} else if (!typesFuel.contains(newTypeFuel)) {
			System.out.println("Invalid Fuel!");
		} else {
			this.setTypeFuel(newTypeFuel);
		}
		
	}
	
	//special methods
	public BombaCombustivel(String typeFuel) {
		typeFuel = typeFuel.toLowerCase();
		switch(typeFuel) {
			case "gasoline":
				this.typeFuel = typeFuel;
				this.literValue = 4.50;
				this.amountFuelTotal = 100.0;
				break;
			case "alcohol":
				this.typeFuel = typeFuel;
				this.literValue = 3.50;
				this.amountFuelTotal = 100.0;
				break;
			case "gnv":
				this.typeFuel = typeFuel;
				this.literValue = 2.50;
				this.amountFuelTotal = 100.0;
				break;
			default: System.out.println("We don't have that fuel!"); break;
		}
	}
	
	private String getTypeFuel() {
		return this.typeFuel;
	}
	
	private void setTypeFuel(String newTypeFuel) {
		this.typeFuel = newTypeFuel;
	}
	
	private double getLiterValue() {
		return this.literValue;
	}
	
	private void setLiterValue(double newValueLiter) {
		this.literValue = newValueLiter;
	}

	public double getAmountFuel() {
		return this.amountFuelTotal;
	}
	
	public void setAmountFuel(double amountFuel) {
		this.amountFuelTotal -= amountFuel;
	}
	
	@Override
	public String toString() {
		return "Bomba De Combustível: [Fuel = " + this.getTypeFuel() + 
				", Value of Liter = R$" + this.getLiterValue() + ", Amount Fuel = " + this.getAmountFuel() + "L]";  
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj instanceof BombaCombustivel) {
	      BombaCombustivel any = (BombaCombustivel) obj;
	      return this.typeFuel.equals(any.getTypeFuel()) && this.literValue == any.getLiterValue()
	    		  && this.amountFuelTotal == any.getAmountFuel();
	    } else {
	      return false;
	    }
	}
	
}
	

