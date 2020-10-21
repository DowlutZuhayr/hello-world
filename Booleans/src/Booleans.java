/**
 * 
 */

/**
 * @author DELL
 *
 */
public class Booleans {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primitive boolean:
		boolean bool = true;
		
		//wrapper class:
		Boolean wrapper = new Boolean(true);
		
		//auto boxing
		Boolean autoboxed = false;
		
		//un-boxing
		boolean unboxed = wrapper;
		
		//functionalities of the wrapper
		String s = wrapper.toString();
		boolean fromString = Boolean.parseBoolean(s);
		Boolean and = Boolean.logicalAnd(bool, autoboxed);
		
		System.out.println(and);
		System.out.println(wrapper);
		System.out.println(unboxed);
		System.out.println(fromString);
		
		

	}

}
