//Make a program that simulates a dice roll. Roll the dice 100 times and store the results in a vector. Then show how many times each value was achieved. Tip: use a vector of counters (1-6) and a function to generate random numbers, simulating the data rolls.
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

class ExerciseListas024 {

	public static void main(String[] args) {
		List<Integer> dice = new LinkedList<Integer>();
		int amountGerator = 100;
		Random gerator = new Random();
		
		for (int i = 0; i < amountGerator; i++) {
			int number = gerator.nextInt(6) + 1;
			dice.add(number);
		}
		
		Map<Integer, Integer> geratorToAmount = new HashMap<Integer, Integer> ();
		for (Integer move : dice) {
			if (geratorToAmount.containsKey(move)) {
				Integer count = geratorToAmount.get(move);
				geratorToAmount.put(move, count+1);
			} else {
				geratorToAmount.put(move, 1);
			}
		}
		
		System.out.println("  Number  " + "  Amount  ");
		for(Map.Entry<Integer, Integer> entry : geratorToAmount.entrySet()) {
			System.out.printf("%5d %10d\n", entry.getKey(), entry.getValue());
		}
	}
}
