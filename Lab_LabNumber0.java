import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Lab_LabNumber0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare a constant
		int T_CONSTANT = 2 ;
		
		//declare our variables
		int height = 0;
		int base1 = 0;
		int base2 = 0;
		int area = 0;
		int surprise = 0;
		
		//declare scanner for user inputs
		Scanner key = new Scanner(System.in);
		
		//ask the user for inputs
		System.out.print("Input Height: ");
		height = key.nextInt();
		if (height > 0) {
			System.out.println("Continue");
		}
		else
			System.out.println("Enter a valid positive number:");
			
		
		System.out.print("Input Base1: ");
		base1 = key.nextInt();
		if (base1 > 0) {
			System.out.println("Continue");
		}
		else
			System.out.print("Enter a positive number");
			
		
		System.out.print("Input Base2: ");
		base2 = key.nextInt();
		if (base2 > 0){
			System.out.println("Continue");
		}
		else
			System.out.println("Enter a valid positive number: ");
			
			
		area = (base1 + base2 )/ (T_CONSTANT) * height ;
		surprise = base1 % height;
		
		System.out.println("Trapezoid area is " + area + " , and the surprise number is " + surprise + " . ");
		
		key.close();

	}

}
