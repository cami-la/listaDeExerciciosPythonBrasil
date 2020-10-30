//Make a Program that reads a 10 character vector, and tell how many consonants were read. Print the consonants.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ExerciseListas004 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> letters = new ArrayList<String>();
		List<String> consonants = new ArrayList<String>();
		int lengthArrayLetters = 5;
		
		for (int i =0; i < lengthArrayLetters; i++) {
			System.out.print((i+1) + "o. letter: ");
			String letter = scan.next();
			letters.add(letter);
			if (!letters.get(i).equalsIgnoreCase("a") && !letters.get(i).equalsIgnoreCase("e") &&
				!letters.get(i).equalsIgnoreCase("i") && !letters.get(i).equalsIgnoreCase("o") &&
				!letters.get(i).equalsIgnoreCase("u")) {
					consonants.add(letter);
			}
		}
			
		System.out.println("Letters: "+ letters.toString());
		System.out.println("Consonants: "+ consonants.toString());
		System.out.println("Amount of consonants: " + consonants.size());			
	}
}
