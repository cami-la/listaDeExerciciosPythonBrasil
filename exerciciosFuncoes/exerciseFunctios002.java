/*a program to print:

        1
        1 2
        1 2 3
        .....
        1 2 3 ... n

    to a user-informed node. Use a function that receives an integer value print up to the nth line.
*/
import java.util.Scanner;

class ExerciseFunctions002 {
	
	public void print(int n) {
		for (int i = 1; i <= n; i++) { //para imprimir o primeiro número da linha
			for (int j = 1; j <= i; j++) { //para imprimir os outros números de acordo com o j.
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ExerciseFunctions002 e = new ExerciseFunctions002();
		System.out.println("Enter the \"n\":");
		
		e.print(scan.nextInt());		
	}
}
