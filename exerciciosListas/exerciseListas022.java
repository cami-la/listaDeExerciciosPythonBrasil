/*Your organization has just hired an intern to work in Computer Support, with the intention of surveying the scraps found in this area. His first task is to test all about 200 mice that are there, testing and recording the status of each one, to see what can be taken advantage of.

    You have been asked to develop a program to record this survey. The program should receive an indeterminate number of entries, each containing: a mouse identification number and the type of defect:
    it needs the sphere;
    needs cleaning; a.necessary replacement of the cable or connector; a.broken or unusable An identification equal to zero ends the program. At the end, the program should issue the following report:

Number of mice: 100

Situation Quantity Percentage
1- needs 40 sphere 40%
2- needs cleaning 30 30%
3- need to change the cable or connector 15 15%
4- broken or unusable 15 15%
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

class ExerciseListas022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> situations = new ArrayList<>();
		
		System.out.print("Amount of mouses: ");
		int amoutOfMouses = scan.nextInt();
		
		System.out.println("\"Scraps Survey\"\n\n" + 
				"The possible answer were: \n\n" +
				"1- Need the Ball\n" + "2- Needs Cleaning\n" + "3- Needs to Change the Cable or Connector \n" + "4- Broken or Unusable\n");
		
		while(true) {
			System.out.print("Situation: ");
			int situation = scan.nextInt();
			if (situation == 0) {
				break;
			} else if (situation > 4) {
				System.out.println("Invalid Enter. Try again.");
				continue;
			} else {
				situations.add(situation);
			}
		}
		
		Map<Integer, Integer> situationToAmount = new HashMap<Integer, Integer>();
		for (Integer situation: situations) {
			if (situationToAmount.containsKey(situation)) {
				Integer count = situationToAmount.get(situation);
				situationToAmount.put(situation, count+1);
			} else {
				situationToAmount.put(situation, 1);

			}
		}
		
		String situation = "";
		System.out.println("Situation                                Amount       Percentage");
		for (Map.Entry<Integer, Integer> entry : situationToAmount.entrySet()) {
			if (entry.getKey() == 1) {
				situation = "Need the Ball";
			} else if (entry.getKey() == 2) {
				situation = "Needs Cleaning";
			} else if (entry.getKey() == 3) {
				situation = "Needs to Change the Cable or Connector";
			} else {
				situation = "Broken or Unusable";
			}
			String text3 = "%";
			System.out.printf(Locale.US, "%d - %-40s %d %15.0f%s\n",entry.getKey(), situation, entry.getValue(), (double) ((entry.getValue()*100)/amoutOfMouses), text3);		
		}
	}
}

