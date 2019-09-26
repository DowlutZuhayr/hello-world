import java.util.Scanner;
/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class DECtoHEX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare our keyboard for input
		Scanner key = new Scanner(System.in);
		
		String answer = "";
		do {
		int dec_num, rem;
		String hexdec_num = "";
		
		//input hexadecimal digits
		char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		System.out.println("Input a decimal number: ");
		dec_num = key.nextInt();
		
		while(dec_num>0)
        {
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.println("Hexadecimal number is : "+hexdec_num);
        
        System.out.println("Do you wish to continue? (y/n): ");
        answer = key.next();
        
        key.close();
        
        
		}
		while (answer.equals("y"));
		System.out.println("Conversion Over");
  
	}		
		
}
