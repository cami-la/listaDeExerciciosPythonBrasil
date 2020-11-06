//Craps game. Make a program to implement a game of Craps. The player rolls a pair of dice, getting a value between 2 and 12. If, on the first move, you roll 7 or 11, you are a “natural” and you win. If you take 2, 3 or 12 on the first move, this is called “craps” and you lose. If, on the first play, you made a 4, 5, 6, 8, 9 or 10, this is your "Point". Your goal now is to keep rolling the dice until you take this number again. You lose, however, if you get a 7 before you get this Point again.
import java.util.Random;

class ExerciseFunctions010 {
	public int dice() {
		Random gerator1 = new Random();
		Random gerator2 = new Random();
		
		return gerator1.nextInt(6)+1 + gerator2.nextInt(6)+1;
	}

	public static void main(String[] args) {
		ExerciseFunctions010 e = new ExerciseFunctions010();
		
		int count = 0; int ponto = 0;
		while(true) {
			int value = e.dice();
			count ++;
			System.out.println(count + "o. game: ");
			if (count == 1) {
				if (value == 7 || value == 11) {
					System.out.println(value + " You winner!*");
					System.out.println("---");
					break;
				} else if (value == 2 || value == 3 || value == 12){
					System.out.println(value + " Craps! You loser!");
					break;
				} else {
					System.out.println(value + " Ponto");
					ponto = value;
					System.out.println("---");
					continue;	
				}
			} else {
				if (value == 7) {
					System.out.println(value + " You loser!");
					break;
				}  else if (value == ponto) {
					System.out.println(ponto + " You winner!");
					break;
				}  else  {
					System.out.println(value);
					System.out.println("---");
					continue;	
				}
			}
				
		}
	}
}

