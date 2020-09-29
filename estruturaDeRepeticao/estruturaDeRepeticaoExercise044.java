/* In a presidential election there are four candidates. Votes are informed using a code. The codes used are:

    1, 2, 3, 4 - Votes for the respective candidates
    (you must set up the table eg: 1 - Jose / 2- João / etc)
    5 - Null vote
    6 - Blank Vote

    Make a program that calculates and shows:
    The total number of votes for each candidate;
    The total number of null votes;
    The total number of blank votes;
    The percentage of null votes out of the total votes;
    The percentage of blank votes over total votes. To end the set of votes, the value is zero.
 */
import java.util.Scanner;

class  EstruturaDeRepeticaoExercise044 {
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		
		double joseVote = 0;
		double joaoVote = 0;
		double mariaVote = 0;
		double lauraVote = 0;
		double nullVote = 0;
		double blankVote = 0;
		int count = 0;
		double vote;
		boolean stop = false;
		
		while(!stop) {
			count++;
			System.out.print("Enter your vote: ");
			vote = scan.nextDouble();
			
			while (vote < 0 || vote > 6) {
				System.out.println("Incorrect vote. Try Again!");
				System.out.print("Enter your vote: ");
				vote = scan.nextDouble();
			}
			if (vote == 0) {
				stop = true;
			} else if (vote == 1) {
				joseVote++;
			} else if (vote  == 2) {
				joaoVote++;
			} else if (vote  == 3) {
				mariaVote++;
			} else if (vote  == 2) {
				lauraVote++;
			} else if (vote == 5) {
				nullVote++;
			} else if (vote == 6) {
				blankVote++;
			} 
		}
		System.out.println();
		System.out.println("Total votes: " + (count-1));
		System.out.println("------");
		System.out.println("Jose's Vote: " + joseVote);
		System.out.println("João's Vote: " + joaoVote);
		System.out.println("Maria's Vote: " + mariaVote);
		System.out.println("Laura's Vote: " + lauraVote);
		System.out.println("------");
		System.out.println("Null Vote: " + nullVote);
		System.out.println("Blank Vote: " + blankVote);
		System.out.println("------");
		System.out.println(Math.round(((nullVote/(count-1))*100)) + "% null votes");
		System.out.println(Math.round(((blankVote/(count-1))*100)) + "% blank votes");

	}
}

