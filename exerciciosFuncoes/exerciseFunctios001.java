/*Make a program to print:

        1
        2 2
        3 3 3
        .....
        n n n n n n ... n

    to a user-informed node. Use a function that receives an integer n value and prints up to the nth line.
*/
import java.util.Scanner;

class ExerciseFunctions001 {
	
	public void print(int n) {
		for (int i = 1; i <= n; i++) { // o número que será impresso
			for (int j = 1; j <= i; j++) { // a quantidade de vezes que esse número será impresso na mesma linha.
				System.out.print(i + " ");
			}
			System.out.println(); //terminou de imprimir, passando para o próximo número imprime outra linha.
		}
	}
	
	public static void main(String[] args) {
		ExerciseFunctions001 e = new ExerciseFunctions001();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number \"n\": ");
		
		e.print(scan.nextInt());
	}
}
