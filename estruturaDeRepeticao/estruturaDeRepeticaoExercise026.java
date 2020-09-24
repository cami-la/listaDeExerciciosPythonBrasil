// In an election there are three candidates. Make a program that asks for the total number of voters. Ask each voter to vote and at the end show the number of votes for each candidate.
import java.util.Scanner;

class EstruturaDeRepeticaoExercise026 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter total voters: ");
    int totalVoters = scan.nextInt();

    int vote;
    int countVotesCandidate1 = 0;
    int countVotesCandidate2 = 0;
    int countVotesCandidate3 = 0;

    for (int i = 1; i <= totalVoters; i++) {
      System.out.print("Voter " + (i) + ", enter your vote: [1/2/3] ");
      vote = scan.nextInt();

      while (vote < 1 || vote > 3) {
        System.out.println("Incorrect vote. Choice between [1/2/3]: ");
        System.out.print("Vote " + (i) + ", enter your vote: [1/2/3] ");
        vote = scan.nextInt();
      }
      System.out.println();

      if (vote == 1) {
        countVotesCandidate1 += 1;      
      } else if (vote == 2) {
        countVotesCandidate2 += 1;      
      } else {
        countVotesCandidate3 += 1;   
      }
    }

    System.out.println("The candidate 1 has " + countVotesCandidate1 + " votes.");
    System.out.println("The candidate 2 has " + countVotesCandidate2 + " votes.");
    System.out.println("The candidate 3 has " + countVotesCandidate3 + " votes.");

  }
}
