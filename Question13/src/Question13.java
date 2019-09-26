import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Question13 {

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
		float current_balance = 0;
		float initial_withdrawal = 0;
		float withdrawal = 0;
		float new_balance = 0;
		float original_balance = 0;
		
		//ask the user for inputs
		System.out.println("Enter your original balance : ");
		original_balance = key.nextFloat();
		System.out.println("Original Balance : " + original_balance);
		
		System.out.println("Your Initial Withdrawal Please : ");
		initial_withdrawal = key.nextFloat();
		
		current_balance = original_balance - initial_withdrawal;
		System.out.println("Current Balance: " + current_balance);
		
		//now the user will be withdrawing from his balance
		System.out.println("Withdraw Amount: ");
		withdrawal = key.nextFloat();
		
		new_balance = current_balance - withdrawal;
		System.out.println("New Balance : " + new_balance);
		
		if (withdrawal > original_balance) {
			System.out.println("Withdrawal Denied");
		}
		
		if (new_balance < 500) {
			System.out.println("Balance below RS 500");
		}
	
		
		System.out.println("Do you wish to continue ? (y/n) : ");
		answer = key.next();
		
		}
		while (answer.equals("y"));
		System.out.println("Program Over");
		
		key.close();
		

	}
		

}
