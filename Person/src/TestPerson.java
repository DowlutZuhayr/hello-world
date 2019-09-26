import java.math.*;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author DELL PC
 *
 */
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person(); //using default constructor
		
		System.out.println(p1.toString()); // display a string representation of Person p1
		
		p1.setFirstName("John"); // change the name of Person p1
		
		System.out.println(p1.toString()); // display a string representation of Person p1
		
		p1.setHeight(170.50); // change the height of Person p1
		
		p1.setNid("D2008982807816");
		
		System.out.println(p1.toString());
		//get name and height of Person p1
		System.out.println("Height of " + p1.getFirstName() + " is: "  + p1.getWeight());

		/***********************************************************************************/
		
		/* creating another object of type Person */
		Person p2 = new Person ("16/08/19", 2.5); //using overloaded 2 arguments constructor
		p2.setFirstName("Sara");
		p2.setHeight(35.2);
		
		System.out.println("Height of " + p2.getFirstName() + " is: " + p2.getheight());
		
		/************************************************************************************/
		
		/* creating another object of type Person*/
		/*instantiating another object of type Person*/
		Person p3 = new Person("B010282007007B", "James", "Bond", 'M', "01/02/82", 85.5, 190.7);
		
		System.out.println(p3.toString()); //display string representation of p3
		
		
		
		System.out.println("Nid of " + p3.getName() + "  is: " + p3.getNid());
		System.out.println("First Name is: "  + p3.getFirstName());
		System.out.println("Last Name of " + p3.getFirstName() + " is " + p3.getLastName());
		System.out.println("Gender = " + p3.getGender());
		System.out.println("Date of Birth is " + p3.getDob());
		System.out.println("Height and Weight of " + p3.getFirstName() + " is " + p3.getheight() + " and " + p3.getWeight() + " respectively.");
		System.out.println("bmi is:" + p3.getBmi());
		
		
		System.out.println(p3.toString()); // display string representation of p3
		
		
		p3.setFirstName("Johny");
		p3.setLastName("Break");
		
		System.out.println(p3.toString());
		
		// updating weight of Person p3 
		p3.setWeight(250.50);
		
		//determining bmi of Person p3
		
		System.out.println(p3.getName() + ", after losing his role as James Bond who was 85.4 kg, he is now " + p3.getWeight() + " kg ");
		System.out.println("His BMI was 23.5 now is " + p3.getBmi()  );
		
		/***************************************************************************************************************/
		
		//do not use the == signs, use .equals instead. Comparing nids of two person
		
		if (p1.equals(p3)) {
			System.out.println("Same Person");
		}
		else {
			System.out.println("Different Person");
		}
		
		/**********************************************************/
		
		Scanner key = new Scanner(System.in);
		int size = 0;
		int i =0;
		int j =0;
		String nid = " ";
		String firstName = " ";
		String lastName = " ";
		String Dob = " ";
		char gender = ' ';
		String dob = " ";
		double weight = 0.0;
		double height = 0.0;
		double bmi = 0.0;
		
		
		
		System.out.println("enter array size");
		size = key.nextInt();
		Person [] dbaStudents = new Person[size];
		
		
		for(i = 0; i < dbaStudents.length; i++) {
			//ask the user for the values of the Person attribute
			System.out.println("Enter the nid of student " + (i+1));
			nid = key.next();
			
			System.out.println("Enter the first name of student " + (i+1));
			firstName = key.next();
			
			System.out.println("Enter the last name " + (i+1));
			lastName = key.next();
			
			System.out.println("Enter the gender " + (i+1));
			gender = key.next().charAt(0);
					
			System.out.println("Enter the dob " + (i+1));
			dob = key.next();
			
			System.out.println("Enter wwight " + (i+1));
			weight = key.nextDouble();
			
			System.out.println("enter height " + (i+1));
			height = key.nextDouble();
			
			
			//create Person objects with the input values
			System.out.println("Enter students " + (i+1));
			
			//save into array
			dbaStudents[i] = new Person();
			System.out.println(dbaStudents.toString());
		}
		bmi = (weight / Math.pow((height/100), 2));
		//for loop syso bmi
		
		for(i = 0; i<dbaStudents.length; i++) {
			System.out.println("the bmi of student " + (i+1 + " is :"));
			bmi = (weight / Math.pow((height/100), 2));
			
			
		}
		
		
		
			
			
		
		
				
			
		
		
		
		
	}

}
