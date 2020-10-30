/*Use a list to solve the problem below. A company pays its salespeople on a commission basis. The salesperson receives $ 200 a week plus 9 percent of his gross sales for that week. For example, a salesperson who had gross sales of $ 3000 in a week receives $ 200 plus 9 percent of $ 3000, that is, a total of $ 470. Write a program (using an array of counters) that determines how many salespeople received wages in the following ranges of values:

    $ 200 - $ 299
    $ 300 - $ 399
    $ 400 - $ 499
    $ 500 - $ 599
    $ 600 - $ 699
    $ 700 - $ 799
    $ 800 - $ 899
    $ 900 - $ 999
    $ 1000 onwards

Challenge: Create a formula to get to the list position from the salary, without making several nested ifs.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ExerciseListas016 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Double> fees = new ArrayList<>();
		
		boolean addSalary = true;
		while(addSalary) {
			System.out.print("Gross sale value: ");
			double sale = scan.nextDouble();
			double salary = 200 + (sale*0.3);
			fees.add(salary);
			
			while(true) {
				System.out.print("Do you want continue? ");
				String result = scan.next();
				if (result.equalsIgnoreCase("Y")) {
					break;
				} else if (result.equalsIgnoreCase("N")) {
					addSalary = false;
					break;
				} else {
					System.out.println("Enter with \"Y\" or \"N\"");
					continue;
				}
			}
		}
		
			int a=0, b=0, c =0, d=0, e=0, f=0, g=0, h=0, i=0;
			for (Double value : fees) {
				if (value <= 299) {
					a++;
				} else if (value <= 399) {
					b++;
				} else if (value <= 499) {
					c++;
				} else if (value <= 599) {
					d++;
				} else if (value <= 699) {
					e++;
				} else if (value <= 799) {
					f++;
				} else if (value <= 899) {
					g++;
				} else if (value <= 999) {
					h++;
				} else if (value > 1000) {
					i++;
				}
			}
			System.out.println("--------");
			System.out.println(fees);
			System.out.println("Fees between $200-299: " + a);
			System.out.println("Fees between $200-299: " + b);
			System.out.println("Fees between $200-299: " + c);
			System.out.println("Fees between $200-299: " + d);
			System.out.println("Fees between $200-299: " + e);
			System.out.println("Fees between $200-299: " + f);
			System.out.println("Fees between $200-299: " + g);
			System.out.println("Fees between $200-299: " + h);		
	}

}

