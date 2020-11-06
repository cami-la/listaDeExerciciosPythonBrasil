//Make a program that converts from 24-hour notation to 12-hour notation. For example, the program should convert 14:25 to 2:25 P.M. The entry is given in two integers. There must be at least two functions: one for converting and one for output. Record the information A.M./P.M. as an 'A' value for AM and 'P' for PM So the function to perform the conversions will have a formal parameter to record whether it is AM or PM Include a loop that allows the user to repeat this calculation for new input values all as many times as you want.
import java.util.Scanner;

class ExerciseFunctions006 {
	
	public void converter(int h, int m) {
		String a = "AM";
		String p = "PM";
		if ((h >= 13 && h <= 24) && (m > 0 && m < 60)) {
			switch(h) {
				case 13: h = 1; break;
				case 14: h = 2; break;
				case 15: h = 3; break;
				case 16: h = 4; break;
				case 17: h = 5; break;
				case 18: h = 6; break;
				case 19: h = 7; break;
				case 20: h = 8; break;
				case 21: h = 9; break;
				case 22: h = 10; break;
				case 23: h = 11; break;
				case 24: h = 12; break;
			}
			System.out.printf("%d:%d %s\n", h, m, p);
		} else if (h < 13){
			System.out.printf("%d:%d %s\n", h, m, a);
		} else {
			System.out.println("Enter Invalid.");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ExerciseFunctions006 e = new ExerciseFunctions006();
		
		int hour = 0; int minute = 0;
		while(true) {
			System.out.print("Enter h (999 break): ");
			hour = scan.nextInt();
			if (hour == 999) {
				break;
			} else {					
				System.out.print("Enter m: ");
				minute = scan.nextInt();					
					
				e.converter(hour, minute);
			}	
		}	
	}
}

