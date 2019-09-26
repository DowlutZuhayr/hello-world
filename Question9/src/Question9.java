import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Question9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare our keyboard
		Scanner key = new Scanner(System.in);
		
		String answer ="";
		do {
		
		//declare our variables
		double sales = 0;
		double sales_discount = 0;
		
		//ask the user for inputs
		System.out.println("Enter the number of sales : ");
		sales = key.nextDouble();
		
		//now using the if statement
		if (sales > 10000) {
			sales_discount = (double) ((0.9)*(sales));
			System.out.println("The new price of sales is RS " + sales_discount);
		}
		else System.out.println("The price of sales is RS " + sales );
		
		System.out.println("Do you want to continue (y/n)");
		answer = key.next();
	
		}
		while (answer.equals("y"));
		System.out.println("Program is over");		
	}

}
