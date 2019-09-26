import java.util.Scanner;
/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class minmax {

	/**
	 * @param args
	 * @param 0 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter your marks: ");
		double mark = keyboard.nextInt();
		
		double sum = 0.0;
		double count = 0.0;
		double max = 0;
		
		//min marks should be the max marks student can get
	    double min = 100;
		
		
		
		
		while (mark != -1) {
		     
			
			sum = sum + mark;
			count = count + 1;
			
			
			
			System.out.println("Next Input. -1 to stop :");
			mark = keyboard.nextDouble();
			
			if (mark < min && mark > 0) {
				min = mark;
			}
			
				if (mark > max && mark > 0) {
				max = mark;
			}
		}
		
		
		
		System.out.println("Your Average is : " + (sum / count));
		
		System.out.println("min mark = " + min);
		System.out.println("max mark = " + max);
		
		


		}
		
		
		

	}


