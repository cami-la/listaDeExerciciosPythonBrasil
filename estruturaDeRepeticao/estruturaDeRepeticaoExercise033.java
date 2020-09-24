//The State Department of Meteorology hired him to develop a program that reads the indeterminate set of temperatures, and informs at the end the lowest and highest temperatures reported, as well as the average temperatures.

import java.util.Scanner; 

class EstruturaDeRepeticaoExercise033 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		double biggest = Integer.MIN_VALUE;
		double smallest = Integer.MAX_VALUE;
		double temperature;
		
		while(true) {
			System.out.print("Enter the temperature: ");
			temperature = scan.nextDouble();
			
			if (temperature < smallest) {
				smallest = temperature;
			}
			if (temperature > biggest) {
				biggest = temperature;				
			}
			System.out.println("The biggest temperature is " + biggest);
			System.out.println("The smallest temperature is " + smallest);
		}
	}
}

