import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Question8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare our keyboard
		Scanner key = new Scanner(System.in);
		
		String answer = "";
		do {
		//declare our variables
		float monthly_sales = 0;
		float years = 0;
		float salary = 0;
		float bonus_salary = 0;
		
		//ask the user to input his monthly sales
		System.out.println("Enter your monthly sales: ");
		monthly_sales = key.nextFloat();
		
		System.out.println("Your monthly sales is " + monthly_sales);
		
		//calculate the salary which is at 15% of monthly sales
		salary = (float) (0.15* monthly_sales);
		System.out.println("Your salary is " + salary);
		
		//ask the user how many years he has been working in the firm
		System.out.println("How many years have you been working with us? : ");
		years = key.nextFloat();
		
		//using the JAVA if 
		if ( years > 3) {
			bonus_salary = (float) (1.10* salary);
			System.out.println("Your updated salary due to your contribution to our firm is " + bonus_salary);
			
			}
		else System.out.println("Your salary is " + salary);
		
		System.out.println("Do you want to continue (y/n) ? ");
		answer = key.next();
		
		}
		while (answer.equals("y"));
		System.out.println("program exit");
		
	
		
	}

}
