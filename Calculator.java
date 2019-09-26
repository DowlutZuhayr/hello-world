import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare our keyboard
		Scanner key = new Scanner(System.in);
		
		//declare our variables
		double num1 , num2 , output ;
		
		//ask the user to input two numbers
		System.out.println("Enter number 1: ");
		num1 = key.nextDouble();
		
		System.out.println("Enter number 2: ");
		num2 = key.nextDouble();
		
		//ask the user to choose an operator
		System.out.println("Choose an operator (+, -, * , / ): ");
		
		/*charAt0;
		 * return the first character of the string
		 *  represented by instance
		 */
		
		char operator = key.next().charAt(0);
		
		//using a switch case
		switch (operator) {
		
		case '+' :
			output = num1 + num2 ;
			break; 
			
		case '-' :
			output = num1 - num2;
			break; 
			
		case '*' :
			output = num1 * num2;
			break;
			
		case '/' :
			output = num1 / num2;
			break; 
			
		//if user has entered a wrong operator 
		default:
			System.out.println("You entered a wrong operator. ");
			return;
			
		
		    
		}
		// display the output for the operator chosen
		System.out.println(num1+" "+operator+" "+num2+" = "+output);
		
		//close the keyboard
		key.close();

	}

}
