/*A research firm needs to tabulate the results of the following survey to a large number of organizations:

"What is the best Operating System to use on servers?"

Possible responses are:

1- Windows Server
2- Unix
3- Linux
4- Netware
5- Mac OS
6- Other

You have been hired to develop a program that reads the poll results and reports the poll results at the end. The program must read the values ​​until the value 0 is entered, which ends the data entry. Values ​​other than those valid for the program (0 to 6) should not be accepted. The values ​​for each option must be stored in a vector. After the data has been completely informed, the program must calculate the percentage of each of the contestants and inform the winner of the poll. The format of the output was given by the company, and is as follows:

Operating System Votes%
------------------- ----- ---
Windows Server 1500 17%
Unix 3500 40%
Linux 3000 34%
Netware 500 5%
Mac OS 150 2%
Other 150 2%
------------------- -----
Total 8800

The most voted Operating System was Unix, with 3500 votes, corresponding to 40% of the votes.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class ExerciseListas019 {
	
	//método criado para saber a porcentagem de cada chave.
	public Double percentage (double numberVotePlayer, double totalVote) {
		return  (numberVotePlayer*100)/totalVote;
	} 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Preciso adicionar elementos repetidos. Logo, uso ArrayList. 
		List<Integer> votes = new ArrayList<>();
		
		System.out.println("\"What is the best Operating System to use on servers?\"\n\n" + 
							"The possible answer were: \n\n" +
							"1- Windows Server\n" + "2- Unix\n" + "3- Linux\n" + "4- Netware\n" + 
							"5- Mac OS\n" + "6- Other\n");
		
		while(true) {
			System.out.print("Aswer (end = 0): ");
			int answer = scan.nextInt();
			if (answer == 0) {
				break;
			} else if (answer < 0 || answer > 6) {
				System.out.println("Invalid Enter. Type the number between 1 and 6.");
				continue;
			} else {
				votes.add(answer);
			}
		}
		
		
		/*Preciso de um conjunto com cada número sem repetições e a quantidade de votos que cada número obteve.
		Neste caso, utilizo o map pois só aceita valores únicos asociado a chave. 
		 */
		Map<Integer, Integer> numberToVote = new HashMap<Integer, Integer>(); 
		//Para cada voto dentro da lista de votos (vote), faça:
		for (Integer vote : votes) {
			//se o voto já estiver dentro do map (numberToVote), faça:
			if (numberToVote.containsKey(vote)) {
				/*Crie um contador para computar a quantidade de vezes que esse valor (vote) aparece.
				Já que esse voto apareceu outra(s) vezes, para adicionar mais 1 vez, precisamos saber quantas vezes ele já
				apareceu. Isso é fácil, é só pegar o valor (value) referente a chave (key) e somar 1 e colocar novamente a chave
				(vote) com seu novo respectivo valor (count++) dentro do nosso map (numberToVote.put). 
				*/
				Integer count = numberToVote.get(vote);
				numberToVote.put(vote, count+1);
			} else {
				/*Caso seja a primera vez que a chave (vote) aparece, simplismente colocamos ela dentro do map com o valor 1.
				já que essa é a primera aparição desta chave.
				*/
				numberToVote.put(vote, 1);
			}
		}
		System.out.println(numberToVote);
		
		/*Agora, precisamos colocar em ordem. O exercício pediu para imprimir na ordem das chaves (1 a 6).
		 Vamos criar um TreeSet que contém elementos do tipo map e para organizar esses elementos dentro do TreeSet,
		 precisamos obrigatoriamente passar no seu construturor, como será organizado esses elementos através da interface
		 Comparator. 
		 */		      
		Set<Map.Entry<Integer, Integer>> orderNumberToVote = new TreeSet<Map.Entry<Integer, Integer>>(
				   new Comparator<Map.Entry<Integer, Integer>>() {
				      public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				          return o1.getKey().compareTo(o2.getKey());
				      }
				   });
		//Vamos adicionar todos os elementos de numberToVote dentro do TreeSet, ele já vai inserir na ordem que definimos acima.
		orderNumberToVote.addAll(numberToVote.entrySet());
		
		/*Já na ordem, agora precisamos trocar os números da chave para String.
		Neste caso usaremos um LinkedHashMap para rastrear a ordem de inserção dois elementos no novo Map, para quando imprimirmos,
		imprimir na ordem correta.
		*/		
		Map<String, Integer> systemOperationToVotes = new LinkedHashMap<String, Integer>(); 	
		//trocando cada número pelo sistema operacional correspondente.
		for (Map.Entry<Integer, Integer> entry : orderNumberToVote) {
			if (entry.getKey() == 1) { //se a chave do elemento entry == 1, troque a chave por:
				systemOperationToVotes.put("Windows Server", entry.getValue());
			} else if (entry.getKey() == 2) {  //se a chave do elemento entry == 2, troque a chave por:
				systemOperationToVotes.put("Unix", entry.getValue());
			} else if (entry.getKey() == 3) {  //se a chave do elemento entry == 3, troque a chave por:
				systemOperationToVotes.put("Linux", entry.getValue());
			} else if (entry.getKey() == 4) {  //se a chave do elemento entry == 4, troque a chave por:
				systemOperationToVotes.put("Netware", entry.getValue());
			} else if (entry.getKey() == 5) {  //se a chave do elemento entry == 5, troque a chave por:
				systemOperationToVotes.put("Mac Os", entry.getValue());
			} else {  //só restou a chave6.
				systemOperationToVotes.put("Other", entry.getValue());
			}
		}
		//System.out.println(systemOperationToVotes);
		
		//criar um objeto para instanciar o método (percentage)
		ExerciseListas019 e = new ExerciseListas019();
		
		String tex1 = "Operational System";
		String tex2 = "Votes";
		String tex3 = "%";
		System.out.printf("\n%s%9s%8s", tex1, tex2, tex3);
		System.out.println("\n-------------------   -----     ---");
		
		
		/*Para finalizar vamos imprir. Vamos imprir. Como queremos cada ítem separadamente, vamos usar o entry.Set() que permite pegar cada ítem 
		 (chave e valor) e manipular separadamente.
		 */
		int sumVotes = 0; int biggerValue = Integer.MIN_VALUE; String biggerKey= "";
		for(Map.Entry<String, Integer> entry : systemOperationToVotes.entrySet()) {
			//para saber qual o maior valor e a chave correspondente a esse valor.
			if (biggerValue < entry.getValue() ) {
				biggerKey = entry.getKey();
				biggerValue = entry.getValue();
			}
			//somando todos os valores.
			sumVotes += entry.getValue();
			//imprimindo
			System.out.printf("%15s %10d %8.2f%s", entry.getKey() , entry.getValue() , e.percentage(entry.getValue(), votes.size()),tex3);
			System.out.println();
		}
		System.out.println("-------------------   -----");
		System.out.printf("Total %20d\n", sumVotes);
		
		System.out.printf("\nThe most voted Operating System was %s, with %d votes, corresponding to %.2f%s of the votes.\n", biggerKey, biggerValue, e.percentage(biggerValue, votes.size()),tex3);
	}
	
}

