/* A statistic was made in five Brazilian cities to collect data on traffic accidents. The following data were obtained:

   a) The. City code;
   B. Number of passenger vehicles (in 1999);
   ç. Number of traffic accidents with victims (in 1999). Want to know:
  d. What is the highest and lowest rate of traffic accidents and to which city does it belong;
   and. What is the average number of vehicles in the five cities together;
   f. What is the average of traffic accidents in cities with less than 2,000 passenger vehicles.
*/
import java.util.Scanner;

class EstruturaDeRepeticaoExercise040 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int codCity;
		int numberOfVehicles;
		int numberOfAccidents;
		
		double biggestIndex = Integer.MIN_VALUE;
		double shortestIndex = Integer.MAX_VALUE;
		int codBiggestIndex = 0;
		int codShortestIndex = 0;
		int vehicleAverage;
		int sumVehicles = 0;
		int vehicleAverageLess2000;
		int sumVehiclesAverageLess2000 = 0;
		int vehicleLess2000=0;
		
		int count = 0;
		while(count < 3) {
			count++;
			
			System.out.print("Cod. City: ");
			codCity = scan.nextInt();
			
			System.out.print("Number of Vehicles in city " + codCity + ":");
			numberOfVehicles = scan.nextInt();
			sumVehicles += numberOfVehicles;
			
			System.out.print("Number of accidents in city " + codCity + ":");
			numberOfAccidents = scan.nextInt();
			
			System.out.println();
			if (numberOfAccidents > biggestIndex) {
				codBiggestIndex = codCity;
				biggestIndex = numberOfAccidents;
			}
			
			if (numberOfAccidents < 2000) {
				vehicleLess2000++;
				sumVehiclesAverageLess2000 += numberOfAccidents;
			}
			
			if (numberOfAccidents < shortestIndex) {
				codShortestIndex = codCity;
				shortestIndex = numberOfAccidents;
			}			
			
		}
			
			vehicleAverage = sumVehicles/3;
			vehicleAverageLess2000 = sumVehiclesAverageLess2000/vehicleLess2000;
			System.out.println("--------");
			System.out.println("Biggest Index: cod." +  codBiggestIndex + "-" + biggestIndex);
			System.out.println("Shortest Index: cod." +  codShortestIndex + "-" + shortestIndex);
			System.out.println("Vehicle Avanger of cities: " + vehicleAverage);
			System.out.println("Vehicle Avanger less 2000 of cities: " + vehicleAverageLess2000);
	}			
}

