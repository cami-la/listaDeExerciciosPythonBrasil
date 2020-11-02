/*Make a program that loads a list with the five car models (example of models: FUSCA, GOL, VECTRA etc). Load another list with the consumption of these cars, that is, how many kilometers each of these cars makes with a liter of fuel. Calculate and show:

    The most economical car model;
    How many liters of fuel does each registered car consume to cover a distance of 1000 kilometers and how much will it cost, considering one that gasoline costs R $ 2.25 per liter. Below is an example screen. The layout of the information should be as close as possible to the example. The data is fictitious and can change with each program run.

Comparison of Fuel Consumption

Vehicle 1
Name: Beetle
Km per liter: 7
Vehicle 2
Name: goal
Km per liter: 10
Vehicle 3
Name: uno
Km per liter: 12.5
Vehicle 4
Name: Vectra
Km per liter: 9
Vehicle 5
Name: Peugeout
Km per liter: 14.5

Final report
 1 - Beetle - 7.0 - 142.9 liters - R $ 321.43
 2 - goal - 10.0 - 100.0 liters - R $ 225.00
 3 - one - 12.5 - 80.0 liters - R $ 180.00
 4 - vectra - 9.0 - 111.1 liters - R $ 250.00
 5 - peugeout - 14.5 - 69.0 liters - R $ 155.17
The lowest consumption is peugeout.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class ExerciseListas021 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*criando 2 List conforme pedido no enunciado do exercício. Neste caso ArrayList pois queremos os índices da inserção
		dos elementos, por tanto, a ordem importa.
		*/
		List<String> cars = new ArrayList<>();
		List<Double> carConsumption = new ArrayList<>();
		double priceGasoline = 2.25;
		double totalDistance = 1000.0;
		int totalCars = 5;
		
		//adicionando os nomes dos carros na List (car) e o km/l na List (carConsumption).
		for (int i = 0; i < totalCars; i++) {
			System.out.println("Vehicle " + (i+1) + ": ");
			System.out.print("Name: ");
			String name = scan.next();
			cars.add(name);
			System.out.print("KM per liter: ");
			double km = scan.nextDouble();
			carConsumption.add(km);
		}
		
		//impriindo igual ao exemplo.
		System.out.println("\nFinal Report");
		for (int i = 0; i < totalCars; i++) {
			System.out.printf(Locale.US, "%2d - %7s - %6.2f - %6.2f liters - R$ %6.2f\n", (i+1), cars.get(i), carConsumption.get(i),
								(totalDistance/carConsumption.get(i)), (totalDistance/carConsumption.get(i)*priceGasoline));
		}
		
		//pegando o índice do maior km/ por litro, que vai corresponder ao mesmo índice do carro.
		double lowerConsumption = Integer.MIN_VALUE; // atenção, o menor consumo é aquele carro que percorre mais km com 1L.
		int indexLowerConsuption = 0;
		for (Double km : carConsumption) {
			if (lowerConsumption < km) {
				lowerConsumption = km;
				indexLowerConsuption = carConsumption.indexOf(lowerConsumption);
			}
		}
		System.out.println("The lowest consumption is " + cars.get(indexLowerConsuption) + ".");
	}
}

