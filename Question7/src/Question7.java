import java.awt.RenderingHints.Key;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Question7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare our scanner
		String answer = "";
		do {
		Scanner key = new Scanner (System.in);
		
		//declare our variable
		float gross_salary = 0;
		float net_salary = 0;
		
		//ask user for inputs
		System.out.println("Enter your gross salary: ");
		gross_salary = key.nextFloat();
		System.out.println("You entered your gross salary to : " + gross_salary);
		
		//using an if to evaluate conditions
		if (gross_salary <= 5000 ) {
			net_salary = (float) (gross_salary - (0.05*(gross_salary)));
			System.out.println("Your net salary is " + " RS " + net_salary);
		}
		if (gross_salary > 5000) {
			net_salary = (float) (gross_salary -((0.1)*(gross_salary)));
			System.out.println("Your net salary is " + " RS " + net_salary);
		}
		
		System.out.println("do you want to continue?");
	     answer= key.next();
		}
		while (answer.equals("y"));
		System.out.println("Program has been exit successfully");
		
		
			
		
		

	}
	

}
