import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Question10 {

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
		float bill = 0;
		float tip = 10;
		
		//ask the user to input 
		System.out.println("How much for the bill ? :");
		bill = key.nextFloat();
		System.out.println("Your bill is RS " + bill);
		
		//now for the tip
		tip =(float) 0.15*(bill) + 10;
		System.out.println("Total tip is RS " + tip);
		
		System.out.println("Do you want to continue (y/n) ? ");
		answer = key.next();
		}
		while (answer.equals("y"));
		System.out.println("Program exit");
		
		key.close();
	}
	

}
