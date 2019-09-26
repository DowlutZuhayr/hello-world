import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Question12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare our keyboard
		Scanner key = new Scanner(System.in);
		
		String answer = "";
		do {
		//declare our variables
		int orders = 0;
		int total_cost1 = 0;
		int total_cost2 = 0;
		
		//request user for orders
		System.out.println("How much DVDs did you order? :");
		orders = key.nextInt();
		
		//using the if statement
		if (orders > 100) {
			total_cost1 = (int)(6*orders);
			System.out.println("Your total cost is " + total_cost1);
		}
		else
			total_cost2 = (int)(8*orders);
			System.out.println("Your total cost is " + total_cost2);
			
			System.out.println("Do you wish to continue? (y/n): ");
			answer = key.next();
			
		}
		while (answer.equals("y"));
		System.out.println("Program Exit");
		
		key.close();
	}

}
