/*Using lists make a program that asks a person 5 questions about a crime. The questions are:

    "Did you call the victim?"
    "Were you at the crime scene?"
    "Do you live near the victim?"
    "Should it be for the victim?"
    "Have you worked with the victim?" 
    The program must ultimately issue a rating on the person's participation in the crime. 
    If the person responds positively to 2 questions he should be classified as "Suspect",
     between 3 and 4 as "Accomplice" and 5 as "Assassin". Otherwise, he will be classified as "Innocent".
*/
import java.util.ArrayList;
import java.util.Scanner;

class ExerciseListas014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> answers = new ArrayList<String>(5);
		int numberOfQuestions = 5;
		
		int yes = 0;

		while(true) {
			System.out.print("Did you call the victim?");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {
				answers.add(answer);
				yes++;
				break;
			} else if (answer.equalsIgnoreCase("no")){
				break;
			} else if ((!answer.equalsIgnoreCase("yes")) && (!answer.equalsIgnoreCase("no"))) {
				System.out.println("Enter with \"yes\" or \"no\"");
				continue;
			}
		}
		
		while(true) {
			System.out.print("Were you at the crime scene");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {
				answers.add(answer);
				yes++;
				break;
			} else if (answer.equalsIgnoreCase("no")){
				break;
			} else if ((!answer.equalsIgnoreCase("yes")) && (!answer.equalsIgnoreCase("no"))) {
				System.out.println("Enter with \"yes\" or \"no\"");
				continue;
			}
		}
		
		while(true) {
			System.out.print("Do you live near the victim?");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {
				answers.add(answer);
				yes++;
				break;
			} else if (answer.equalsIgnoreCase("no")){
				break;
			} else if ((!answer.equalsIgnoreCase("yes")) && (!answer.equalsIgnoreCase("no"))) {
				System.out.println("Enter with \"yes\" or \"no\"");
				continue;
			}
		}
		
		while(true) {
			System.out.print("Should it be for the victim?");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {
				answers.add(answer);
				yes++;
				break;
			} else if (answer.equalsIgnoreCase("no")){
				break;
			} else if ((!answer.equalsIgnoreCase("yes")) && (!answer.equalsIgnoreCase("no"))) {
				System.out.println("Enter with \"yes\" or \"no\"");
				continue;
			}
		}
		
		while(true) {
			System.out.print("Have you worked with the victim?");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {
				answers.add(answer);
				yes++;
				break;
			} else if (answer.equalsIgnoreCase("no")){
				break;
			} else if ((!answer.equalsIgnoreCase("yes")) && (!answer.equalsIgnoreCase("no"))) {
				System.out.println("Enter with \"yes\" or \"no\"");
				continue;
			}
		}

		System.out.println("-------");
		switch(yes) {
			case 0:
			case 1: System.out.println("Innocent"); break;
			case 2: System.out.println("Suspect"); break;
			case 3:
			case 4: System.out.println("Accomplice"); break;
			case 5: System.out.println("Assassin"); break;
		}
	}
}

