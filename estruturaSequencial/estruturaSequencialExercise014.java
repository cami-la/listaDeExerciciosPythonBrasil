//João Papo-de-Pescador, a good man, bought a microcomputer to control the daily income of his work. Every time he brings a weight of fish greater than that established by the fishing regulations of the state of São Paulo (50 kilos) he must pay a fine of R $ 4.00 per kilo in excess. João needs you to make a program that reads the variable weight (fish weight) and calculates the excess. Record in the excess variable the amount of kilos beyond the limit and in the fine variable the amount of the fine that João must pay. Print the program data with the appropriate messages.
import java.util.Scanner;

class EstruturaSequencialExercise014 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    int weightLimit = 50;
    System.out.print("How the weight(kg) of the João's fish? ");
    double weightFish = scan.nextDouble();

    System.out.println("The weight limite is " + weightLimit + "kg");
    if (weightFish > weightLimit) {
      double weightExceeded = weightFish - weightLimit;
      double tax = weightExceeded * 4;
      System.out.println("João Papo-de-Pescador irá pagar uma multa de R$" + tax + " per " + weightExceeded + "kg exceedeed." );
    } else {
      System.out.println("João Papo-de-Pescador did not exceed the limit!");
    }
    

  }
}
