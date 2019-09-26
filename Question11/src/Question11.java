import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Question11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare our keyboard
		Scanner key = new Scanner (System.in);
		
		String answer = "";
		do {
		//declare our variables
		int num = 0;
		
		//ask the user to input a number between 1-50
		System.out.println("Enter a number between 1 and 50 : ");
		num = key.nextInt();
		
		//using the if statement
		if (num < 1 || num > 50) {
			System.out.println("Invalid output");
		}
		else 
			System.out.println(num);
		
		System.out.println("Do you want to continue (y/n)");
		answer = key.next();
		
		}
		while (answer.equals("y"));
		System.out.println("Program Exit");
		
		key.close();
	}

}
