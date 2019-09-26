import java.util.Scanner;
/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class Question3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		//ask the user to calculate the volume in pints
		//assume the volume of paint in a rectangle 
		//we will be needing length, width and depth
		
		double length;
		double width;
		double depth;
		
		
		System.out.println("Please enter the length: ");
		length = key.nextDouble();
		
		System.out.println("Please enter the width: ");
		width = key.nextDouble();
		
		System.out.println("Please enter the depth: ");
		depth = key.nextDouble();
		
		//calculate the volume in PINTS
		double volume = length * width* depth;
		System.out.println(" Total volume of pints of paint in rectangle is " + volume);
		
		//now we convert the pints into litres
		//where 1 litre = 2.2 pints
		
		double litres = volume / 2.2;
		System.out.println(" Or the volume of litres in the rectangle is " + litres);
		
		key.close();

	}

}
