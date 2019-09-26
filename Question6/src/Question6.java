import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Question6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare our keyboard
		Scanner key = new Scanner(System.in);
		
		//declare our variables
		String answer = "";
		
		do {
		float purchase;
		float cost;
		float cost1;
		float sold;
		
		
		//ask the user for inputs
		System.out.println("How much stock  did you purchase? : ");
		purchase = key.nextFloat();
		
		System.out.println("How much did one unit cost? : ");
		cost = key.nextFloat();
		
		System.out.println("How much stock did you sell? : ");
		sold = key.nextFloat();
		
		System.out.println("How much did you sell one unit? : ");
		cost1 = key.nextFloat();
		
		float totalCost = purchase * cost;
		System.out.println("The TOTAL COST is " + totalCost);
		
		float totalRevenue = sold * cost1;
		System.out.println("The TOTAL REVENUE is " + totalRevenue);
		
		
		//now we use if case 
		if (totalCost == totalRevenue) {
			System.out.println("Break Even");
		}
		if (totalCost > totalRevenue) {
			float loss = totalCost - totalRevenue;
			System.out.println("Loss of RS " + loss);
			
			
		}
		if (totalCost < totalRevenue) {
			float profit = totalRevenue - totalCost;
			System.out.println("Profit of RS " + profit);
			
		}
		System.out.println("do you want to continue?");
	     answer= key.next();
		
		
		}
		//asking the user if he/she wants to try again. Enter "y" to repeat.
		while (answer.equals("y"));
		System.out.println("Program has been exit successfully");
	}

}
