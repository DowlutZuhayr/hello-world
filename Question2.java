import java.util.Scanner;
/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Question2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Please enter the number of seconds: ");
		int seconds = key.nextInt();
		int n = seconds / 60;
		
		System.out.println(seconds + " seconds gives you " + n + " minutes. " );
		
		key.close();
		

	}

}
