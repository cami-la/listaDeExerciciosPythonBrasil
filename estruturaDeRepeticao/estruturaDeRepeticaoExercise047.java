/*In a gymnastics competition, each athlete receives votes from seven judges. The best and worst grades are eliminated. Your grade is the average of the remaining votes. You must make a program that receives the name of the gymnast and the scores of the seven judges achieved by the athlete in his presentation and then enter his average, as described above (remove the best and worst jump and then calculate the average with the remaining notes). Notes are not reported in order. An example of program output should be as follows:

Athlete: Aparecido Parente
Score: 9.9
Score: 7.5
Score: 9.5
Score: 8.5
Score: 9.0
Score: 8.5
Score: 9.7

Final result:
Athlete: Aparecido Parente
Best score: 9.9
Worst grade: 7.5
Average: 9.04

*/
import java.util.Scanner;

class EstruturaDeRepeticaoExercise047 {
  public static void main(String[] args) {
    System.out.println();
    Scanner scan = new Scanner(System.in);
		
		String athleteName;
		double athleteGrade;
		double biggestGrade = Integer.MIN_VALUE; 
		double shortestGrade = Integer.MAX_VALUE;
		double avanger;
		double sumGradeAthlete =  0;
		int numberNotes = 7;
		
		System.out.print("Athlete: ");
		athleteName = scan.next();
			
		for (int i = 1; i <= numberNotes; i++) {
			System.out.print(i + "o. grade: ");
			athleteGrade = scan.nextDouble();
			
			if (athleteGrade > biggestGrade) {
				biggestGrade = athleteGrade;
			}
			if (athleteGrade < shortestGrade) {
				shortestGrade = athleteGrade;
			}	
			
			if (athleteGrade < biggestGrade && athleteGrade > shortestGrade) {
				sumGradeAthlete += athleteGrade;
			}
					
		}
		System.out.println("----------");
		System.out.println("FINAL RESULT:");
		System.out.println("Athlete: " + athleteName);
		System.out.println("Best Grade: " + biggestGrade);
		System.out.println("Worst Grade: " + shortestGrade);
		System.out.println("Avanger: " + (sumGradeAthlete/(numberNotes-2)));	
		
	}
}


