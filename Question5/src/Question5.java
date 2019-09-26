import java.util.Scanner;
import java.util.*;
/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Question5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		String answer = "";
		do {
			
			//asks the user to input 2 items:
			
			
			 String item1;
			 String item2;
			
			 System.out.println("Enter first item: ");
			 item1 = key.next();
			 
			 System.out.println("Enter second item: ");
			 item2 = key.next();
			 
			 float cost1;
			 float cost2;
			 
			 System.out.println("Enter the cost of " + item1 + " :");
			 cost1 = key.nextFloat();
			 
			 System.out.println("Enter the cost of " + item2 + " :" );
			 cost2 = key.nextFloat();
			 
			 int quan1;
			 int quan2;
			 
			 System.out.println("How much " + item1 + " did you purchase? : ");
			 quan1 = key.nextInt();
			 
			 System.out.println("How much " + item2 + " did you purchase? : ");
			 quan2 = key.nextInt();
			 
			 // VAT = 15% 
			 
			 float subtotal1 = (float) (1.15*(cost1 * quan1));
			 float subtotal2 = (float) (1.15*(cost2 * quan2));
			 float grand_total = subtotal1 + subtotal2;
			 
			 System.out.println("Your subtotal for " + item1 + " is " + " RS " + subtotal1);
			 System.out.println("Your subtotal for " + item2 + " is " + " RS " + subtotal2);
			 System.out.println("Your grand total with VAT for both items is  " + " RS " + grand_total );
			 
			 System.out.println("do you want to continue?");
		     answer= key.next();
			 
		}
		while(answer.equals("y"));
		
		System.out.println("You decided to end this program");
			
		  
		 
		 
		 
		 

	}

}
