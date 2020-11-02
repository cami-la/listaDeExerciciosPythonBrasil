/*A major television station wants to take a poll among its viewers to find out who is the best player after each game. For this, it is necessary to develop a program, which will be used by telephone operators, for the calculation of votes. His team was hired to develop this program, using the C ++ programming language. To compute each vote, the operator will enter a number, between 1 and 23, corresponding to the player's shirt number. A player number equal to zero indicates that voting has ended. If an invalid number is entered, the program should ignore it, showing a brief warning message, and asking for another number again. After voting is finished, the program should display:

    The total vote counted;
    The numbers and respective votes of all players who received votes;
    The percentage of votes for each of these players;
    The number of the player chosen as the best player in the match, along with the number of votes and the percentage of votes given to him.
        Note that invalid votes and final zero must not be counted as votes. The result appears ordered by the player's number. The program must make use of arrays. The program should perform the calculation of the percentage of each player through a function. This function will receive two parameters: the number of votes for a player and the total number of votes. The function will calculate the percentage and return the calculated value. Below is an example screen. The layout of the information should be as close as possible to the example. The data is fictitious and can change with each program run. At the end, the program should also record the data regarding the voting result in a text file on the disk, following the same provision shown on the screen.

Poll: Who was the best player?

Player number (0 = end): 9
Player number (0 = end): 10
Player number (0 = end): 9
Player number (0 = end): 10
Player number (0 = end): 11
Player number (0 = end): 10
Player number (0 = end): 50
Enter a value between 1 and 23 or 0 to leave!
Player number (0 = end): 9
Player number (0 = end): 9
Player number (0 = end): 0

Result of the vote:

8 votes were counted.

Player Votes%
9 4 50.0%
10 3 37.5%
11 1 12.5%
The best player was number 9, with 4 votes, corresponding to 50% of the total votes.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class ExerciseListas018 {	
	//método criado para saber a porcentagem de cada chave
	public Double percentage (double numberVotePlayer, double totalVote) {
		return  (numberVotePlayer*100)/totalVote;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Preciso adicionar elementos repetidos. Logo, uso ArrayList. 
		List<Integer> voting = new ArrayList<>();
		
		System.out.println("Poll: Who was the best player?");

		boolean addVote = true;
		while(addVote) {
			while(true) {
				System.out.print("\nPlayer number (0 = end): ");
				int vote = scan.nextInt();
				if (vote == 0) {
					addVote = false;
					break;
				} else if (vote >= 1 && vote <= 23) {
					voting.add(vote);
					
					break;
				} else {
					System.out.println("Enter a value between 1 and 23 or 0 to leave!");
					continue;
				}
			}			
		}
		System.out.println("\nResult of the vote:\n");
		System.out.println(voting.size() + " votes were counted.\n");
		
		//criando um map para fazer a contagem dos elementos repetidos
		Map<Integer, Integer> playerToVote = new HashMap<Integer, Integer>();
		//para cada elemento do array (voting), faça:
		for(Integer votes : voting){
			//se o valor (votes) já estiver contido no map (playerToVote), faça:
			if(playerToVote.containsKey(votes)){ // se existe
				//crie uma variável para armazenar o valor(quantidade de vezes que o número aparece);
				Integer n = playerToVote.get(votes);
				/*coloque no map o a chave (votes) e a quantidade de vezes que a chave aparece +1, de acordo com a posição 
				chave no arrayList (voting)*/
				playerToVote.put(votes, n+1);
			//se o valor (votes) ainda não está dentro do maps (playerToVote), faça;
			} else {
				/*coloque no map a chave (votes) e a quantidade de vezes será 1, pois é a primeira vez que ele aparece, 
				nas demais vezes, essa chave entrará no if acima.*/
				playerToVote.put(votes,1); // senao é 1
			}
		}
		
		/*Agora, precisamos colocar em ordem. O exercício pediu para imprimir na ordem das chaves (1 a 23).
		 Vamos criar um TreeSet que contém elementos do tipo map e para organizar esses elementos dentro do TreeSet,
		 precisamos obrigatoriamente passar no seu construturor como será organizado esses elementos através da interface
		 Comparator. 
		 */		
		Set<Map.Entry<Integer, Integer>> orderPlayerToVote = new TreeSet<Map.Entry<Integer, Integer>>(
				   new Comparator<Map.Entry<Integer, Integer>>() {
				      public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				          return o1.getKey().compareTo(o2.getKey());
				      }
				   });
		/*Requisito de ordem já feito, vamos adicionar todos os elementos do map playerToVote dentro do TreeSet orderPlayerToVote.
		 Já que existe a organização foi feita, a medida que o elemento do playerToVote for adicionado no orderPlayerToVote será respeitada
		 a ordem. 
		 */
		orderPlayerToVote.addAll(playerToVote.entrySet());
		
		String tex1 = "Jogador";
		String tex2 = "Votos";
		String tex3 = "%";
		System.out.printf("%s%9s%8s", tex1, tex2, tex3);
		
		//criar um objeto para instanciar o método (percentage)
		ExerciseListas018 e = new ExerciseListas018();
		
		int biggerValue = Integer.MIN_VALUE; int biggerKey = 0;
		for (Map.Entry<Integer, Integer> entry : orderPlayerToVote) {
			if (biggerValue < entry.getValue()) {
				biggerValue = entry.getValue();
				biggerKey = entry.getKey();
			}
			System.out.println();   
			System.out.printf("%3d  %9d  %8.2f%s", entry.getKey(), entry.getValue(), e.percentage(entry.getValue(), voting.size()), tex3);
		}		
		System.out.printf("\nThe best player was number %d with %d votes corresponding to %.2f%s of total votes.\n", biggerKey, biggerValue, e.percentage(biggerValue, voting.size()), tex3);
	}
}

