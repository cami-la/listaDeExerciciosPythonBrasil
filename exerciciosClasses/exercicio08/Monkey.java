import java.util.ArrayList;
import java.util.List;

class Monkey {
	//atributes
	private String name;
	private List<String> stomach;
	

	//methods
	public void toEat(String food) {
		stomach.add(food);
	}
	
	public void toEat(Monkey monkeyFood) {
		stomach.add(monkeyFood.getName());
		System.out.printf("The monkey %s is a Cannibal Monkey!\n", this.getName());
	}
	
	public void toDigest() {
		if (!stomach.isEmpty()) {
			stomach.remove(0);
		}
	}
	
	public void toDigest(String food) {
		if (!stomach.isEmpty()) {
			if (stomach.contains(food)) {
				stomach.remove(food);
			} else {
				System.out.printf("The monkey %s did not eat %s.\n", this.getName(), food);
			}
		}
	}
	
	public void seeStomach() {
		if (!stomach.isEmpty()) {
			System.out.printf("Stomatch of monkey %s: ", this.getName());
				for (int i = 0; i < this.stomach.size(); i++) { 
					if (i == this.stomach.size() - 1) { 
						System.out.println(stomach.get(i));
					} else { 
					System.out.print(stomach.get(i) + " - ");
					}
				}
		} else { 
			System.out.printf("The monkey %s has an empty stomach!\n", this.getName());
		}	
	}
	
	//special methods
		public Monkey(String name) {
			this.name = name;
			this.stomach = new ArrayList<String>();
		}
		
		private String getName() {
			return this.name;
		}
		
		@Override
		public String toString() {
			return "Monkey; [Name: " + this.getName() + ", Stomach: " + this.stomach + "]"; 
		}
}

