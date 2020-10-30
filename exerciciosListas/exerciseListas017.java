/*In a long jump competition each athlete is entitled to five jumps. The athlete's result will be determined by the average of the remaining five values. You must make a program that receives the name and the five distances reached by the athlete in his jumps and then inform the name, the jumps and the average of the jumps. The program must end when the name of the athlete is not provided. The program output should be as shown in the example below:

Athlete: Rodrigo Curvêllo
 
First Jump: 6.5 m
Second Jump: 6.1 m
Third Jump: 6.2 m
Salto Room: 5.4 m
Fifth Jump: 5.3 m

Final result:
Athlete: Rodrigo Curvêllo
Heels: 6.5 - 6.1 - 6.2 - 5.4 - 5.3
Average hops: 5.9 m
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class ExerciseListas017 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Double> jumps = new ArrayList<Double>();
		int amountOfJumps = 3;
		
		System.out.print("Athlete: ");
		String athlete = scan.next();
		for (int i = 0; i < amountOfJumps; i++) {
			System.out.print((i+1) + "o. jump: ");
			Double jump = scan.nextDouble();
			jumps.add(jump);
		}
		System.out.println("--------");
		System.out.println("UPSHOT");
		System.out.println("Atlhlete: " + athlete);
		System.out.print("Jumps: ");
		double sum = 0;
		for (Double jump : jumps) {
			sum += jump;
			if (jumps.indexOf(jump) == jumps.size()-1) {
				System.out.println(jump);
			} else {
				System.out.print(jump + " - ");
			}
		}
		System.out.println("Average Jump: " + (sum/jumps.size()) + "m");
		
	}
}


