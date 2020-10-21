/**
 * 
 */

/**
 * @author DELL
 *
 */
public class arraysbasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring an array
		int[] arr = new int[5];
		
		//inserting values into the array
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 20;
		arr[4] = 20;
		
		//printing the values on screen
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Elements in store " + i + " : " + arr[i]);
		}

	}

}
