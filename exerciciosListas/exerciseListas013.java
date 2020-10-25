//Make a program that receives the average temperature of each month of the year and stores them in a list. After that, calculate the annual average of the temperatures and show all the temperatures above the annual average,  and in what month they occurred (show the month in full: 1 - January, 2 - February,...).
import java.util.ArrayList;
import java.util.Scanner;

class ExerciseListas013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> averageTemperatures = new ArrayList<Double>();
		int monthYear = 12;
		
		for (int i = 0; i < monthYear; i++) {
			System.out.print((i+1) + "o. temperature: ");
			averageTemperatures.add(scan.nextDouble());
		}
		System.out.println("--------");
		String month;
		for (int i = 0; i < monthYear; i++) {
			switch(i) {
			case 0: month = "january"; System.out.println((i+1) + " - " + month + ":  " + averageTemperatures.get(i) + "°C"); break;
			case 1: month = "february"; System.out.println((i+1) + " - " + month + ":  " + averageTemperatures.get(i) + "°C"); break;
			case 2: month = "march"; System.out.println((i+1) + " - " + month + ":  " + averageTemperatures.get(i) + "°C"); break;
			case 3: month = "april"; System.out.println((i+1) + " - " + month + ":  " + averageTemperatures.get(i) + "°C"); break;
			case 4: month = "may"; System.out.println((i+1) + " - " + month + ":  " + averageTemperatures.get(i) + "°C"); break;
			case 5: month = "june"; System.out.println((i+1) + " - " + month + ":  " + averageTemperatures.get(i) + "°C"); break;
			case 6: month = "july"; System.out.println((i+1) + " - " + month + ":  " + averageTemperatures.get(i) + "°C"); break;
			case 7: month = "agust"; System.out.println((i+1) + " - " + month + ":  " + averageTemperatures.get(i) + "°C"); break;
			case 8: month = "september"; System.out.println((i+1) + " - " + month + ":  " + averageTemperatures.get(i) + "°C"); break;
			case 9: month = "october"; System.out.println((i+1) + " - " + month + ":  " + averageTemperatures.get(i) + "°C"); break;
			case 10: month = "november"; System.out.println((i+1) + " - " + month + ":  " + averageTemperatures.get(i) + "°C"); break;
			case 11: month = "december"; System.out.println((i+1) + " - " + month + ":  " + averageTemperatures.get(i) + "°C"); break;
			}			
		}
	}
}

