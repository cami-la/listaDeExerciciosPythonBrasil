//Make a program that asks for the size of a file to download (in MB) and the speed of an Internet link (in Mbps), calculates and informs the approximate time to download the file using this link (in minutes).
import java.util.Scanner;

class EstruturaSequencialExercise018 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter the size of file: ");
    double sizeFile = scan.nextDouble();

    System.out.print("Enter the speed of internet: ");
    double speedInternet = scan.nextDouble();

    double timeDownload = sizeFile/speedInternet;

    System.out.println("The spend time was : " + timeDownload);
  }
}
