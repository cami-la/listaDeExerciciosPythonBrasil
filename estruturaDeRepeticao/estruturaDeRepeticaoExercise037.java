//A gym wants to make sense among its customers to discover the tallest, the shortest, the fattest and the leanest, for that you must make a program that asks each of the academy's clients their code, their height and their Weight. The end of data entry must be given when the user enters 0 (zero) in the code field. At the end of the program, the codes and values of the highest, lowest, fattest and leanest customers must also be informed, in addition to the average customer height and weight.

import java.util.Scanner;
class EstruturaDeRepeticaoExercise037 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double tallest = Integer.MIN_VALUE;
		double shortest = Integer.MAX_VALUE;
		double fattest = Integer.MIN_VALUE;
		double leanest = Integer.MAX_VALUE;
		int codTallest = 1;
		int codShortest = 1;
		int codFattest = 1;
		int codLeanest = 1;
		
		double sumHeight = 0;
		double sumWeight = 0;
		double height;
		double weight; 
		int count = 0;
		
		int cod = 1;
		boolean register = false;
		
		while(true) {
			
			
			System.out.print("Cod.: ");
			cod = scan.nextInt();
			
			if (cod == 0) {
				break;
			}
			
			count++;
			System.out.print("Height: ");
			height = scan.nextDouble();
			sumHeight += height;
			
			System.out.print("Weight: ");
			weight = scan.nextDouble();
			sumWeight += weight;
			
			if (height > tallest) {
				tallest = height;
				codTallest = cod;
			}
			if (height < shortest) {
				shortest = height;
				codShortest = cod;
			}
			if (weight > fattest) {
				fattest = weight;
				codFattest = cod;
			}
			if (weight < leanest) {
				leanest = weight;
				codLeanest = cod;
			}
		  }
		
		System.out.println("---------------------------------------");
		System.out.println("Tallest cod. " + codTallest + " -  " + tallest);
		System.out.println("Shortest: cod. " + codShortest + " - " + shortest);
		System.out.println("Fattest: cod. " + codFattest + " - " + fattest);
		System.out.println("Leanest: cod. " + codLeanest + " - " + leanest);
		System.out.println("Avanger of Height: " + (sumHeight/count));
		System.out.println("Avanger of Weight: " + (sumWeight/count));
		System.out.println("---------------------------------------");

	}
}

