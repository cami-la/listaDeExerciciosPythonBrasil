//Criar um vetor A com 10 elementos inteiros. Implementar um programa que designe e escreva a soma de todos os elementos armazenados neste vetor
import java.util.Scanner;

class ExerciseArrayLoianeGroner012 {
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		int[] arrayA = new int[10];
		
		int sum = 0;
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("Enter the position " + (i+1) + "o. the Array A: ");
			arrayA[i] = scan.nextInt();
			
			sum += arrayA[i];
		}
		
		System.out.println("The sum of all elements of Array is: " + sum);
	}
}

