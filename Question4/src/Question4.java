import java.util.Scanner;
/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Question4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		/** calculate the average speed
		 * must have the distance travelled
		 * distance travelled should be in kilometres
		 * must have the time taken to complete that specific journey
		 * ask the user to input the distance and time taken
		 * average speed = distance / time
		 */
		
		float distancekm;
		float time;
		
		System.out.println("Enter the total distance covered: ");
		distancekm = key.nextFloat();
		
		System.out.println("Enter the total time taken to travel: ");
		time = key.nextFloat();
		
		float speed = distancekm / time ;
		System.out.println("Average speed is " + speed + " km/h.");
		
		key.close();
		
		
		
		
		
		
		
	
		
		
		

	}

}
